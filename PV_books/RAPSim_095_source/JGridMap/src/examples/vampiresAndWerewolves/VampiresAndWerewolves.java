package examples.vampiresAndWerewolves;

import jGridMap.JGridMap;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class VampiresAndWerewolves extends Applet implements ActionListener {
		private static final long	serialVersionUID	= 1L;

		Button										restartBt, slowBt, fastBt, reverseBt;
		int												targetIteration;
		double										speed							= 0.01;
		double										scounter					= 0.0;

		int												iteration					= 1;
		private int								width							= 80;
		private int								height						= 60;
		boolean										turnback					= false;
		boolean										reverse						= false;
    double										barriers          = 0.1; //amount of barriers
		int 											nWerewolves				= 1; //the count for werwolves and vampires is not intialized with
		int												nVampires					=	1; //0 since the simulation stops when the count is 0 on one side

		boolean makeReset=false;
		
		int seed=1255;
		
		JGridMap									gridMap;
		private int								view[][];
		Critter 									crittermap[][];
		Critter										allCritters[];
		Random										rand = new Random(seed);

		int bestIt = 0;
		int bestSeed = 0;
		
		/*
		 * either a werewolf or a vampire
		 */
		class Critter implements Comparable<Critter> {
			int crittertype=0;	// 0 is empty, 1 is werewolf, 2 is vampire, 5 is barrier
			double size=0.5+0.2*rand.nextDouble();
			double energy=1.0;
			int x,y;
			boolean toProcess=false;
			
			Critter(int x, int y) {
				this.x=x;
				this.y=y;
			}
			
			Critter(int x, int y,int crittertype) {
				this(x,y);
				this.crittertype=crittertype;
			}
			
			void offspringOf(Critter mother) {
				crittertype=mother.crittertype;
				size=mother.size*(0.9+0.2*rand.nextDouble());
				energy=mother.energy/2;
				mother.energy -= energy;
			}
			
			void copyFrom(Critter other) {
				crittertype=other.crittertype;
				size=other.size;
				energy=other.energy;
				toProcess=other.toProcess;
			}

			@Override
			public int compareTo(Critter other) {
				if (crittertype!=1 && crittertype!=2)
					if (other.crittertype!=1 && other.crittertype!=2)
						return 0;
					else
						return -1;
				if (other.crittertype!=1 && other.crittertype!=2)
					return 1;
				if (size > other.size) return 1;
				if (size < other.size) return -1;
				return 0;
			}
		}
		
		void generateView() {
			
			for(int y=0;y<height;y++) {
				for(int x=0;x<width;x++)
				
					if (crittermap[y][x].crittertype == 1 || crittermap[y][x].crittertype == 2) {
						if (crittermap[y][x].size>1.0)
							view[y][x]=crittermap[y][x].crittertype+2;
						else
							view[y][x]=crittermap[y][x].crittertype;
					}
					else
						view[y][x]=crittermap[y][x].crittertype;
				}
		}
		
		void resetSimulation() {
			//init critters
			view = new int[height][width];
			crittermap = new Critter[height][width];
			allCritters = new Critter[height*width];
			for(int y=0;y<height;y++) {
				for(int x=0;x<width;x++){

					double r=rand.nextDouble();
					if (r<0.1)
						crittermap[y][x]=new Critter(x,y,1);
					else if (r<0.2)
						crittermap[y][x]=new Critter(x,y,2);
					else if (r< 0.2 + barriers)
						crittermap[y][x]=new Critter(x,y,5);
					else
						crittermap[y][x]=new Critter(x,y,0);
					allCritters[y*width+x]=crittermap[y][x];
				}
			}
			nWerewolves=1;
			nVampires=1;
			generateView();
		}
		
		public void init() {
			resetSimulation();
			
			gridMap = new JGridMap(width * 6, height * 6, width, height, 1);
			gridMap.setGridLines(true);
			gridMap.setGridColor(Color.LIGHT_GRAY);
			setLayout(new FlowLayout(10));

			restartBt = new Button("restart");
			slowBt = new Button("slower");
			fastBt = new Button("faster");
			reverseBt = new Button("reverse");
			add(restartBt);
			add(slowBt);
			add(fastBt);
			//add(reverseBt);

			restartBt.addActionListener(this);
			slowBt.addActionListener(this);
			fastBt.addActionListener(this);
			//reverseBt.addActionListener(this);

			add(gridMap);

			gridMap.addColorToScale(1, Color.GRAY);
			gridMap.addColorToScale(2, Color.PINK);
			gridMap.addColorToScale(3, Color.BLACK);
			gridMap.addColorToScale(4, Color.RED);
			
			gridMap.addColorToScale(5, Color.CYAN);

			gridMap.setDataDirect(view);
			//gridMap.setData(view);
			
			Timer timer = new Timer();
			timer.schedule((TimerTask) new Task(), 100, 1);
		}

		class Task extends TimerTask {

			public void run() {
				if (makeReset) {
					rand=new Random(seed);
					resetSimulation();
					makeReset=false;
					iteration = 1;
					targetIteration = 0;	
					speed	=  0.01;
				}
				
				if (nWerewolves==0 || nVampires==0) {
					if (iteration > bestIt) {
						bestIt=iteration;
						bestSeed=seed;
						System.out.println("seed:"+bestSeed+" it:"+bestIt);
					}
					seed++;
					makeReset=true;
					return;
				}
				
				scounter +=speed;
				if (scounter<1.0) return;
				targetIteration = iteration+ (int)scounter;
				while (iteration < targetIteration) {
					iterate();
					iteration++;
				}
				generateView();
				gridMap.setDataDirect(view);
				//gridMap.setData(view);

				scounter-=(int)scounter;
				repaint();
			}
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == restartBt) {
				makeReset=true;
			}
			if (e.getSource() == slowBt) {
				speed /= 1.5;
			}
			if (e.getSource() == fastBt) {
				speed *= 1.5;
			}
		}

		// This method is mandatory, but can be empty.(i.e.,have no actual code).
		public void stop() {}

		// double buffering
		public void update(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			Graphics2D offgc;
			Image offscreen = null;
			Rectangle box = g2d.getClipBounds();

			// create the offscreen buffer and associated Graphics
			offscreen = createImage(box.width, box.height);
			offgc = (Graphics2D) offscreen.getGraphics();
			// clear the exposed area
			offgc.setColor(getBackground());
			offgc.fillRect(0, 0, box.width, box.height);
			offgc.setColor(getForeground());
			// do normal redraw
			offgc.translate(-box.x, -box.y);
			paint(offgc);
			// transfer offscreen to window
			g2d.drawImage(offscreen, box.x, box.y, this);
		}

		// Print a message on the screen (x=20, y=10).
		public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawString("Iteration:" + iteration + "   Werewolves:" + nWerewolves + "   Vampires:"+nVampires, 200, 25);
		}

		public void runSimulaton(int steps) {
			targetIteration = iteration + steps;

			gridMap = new JGridMap(760, 760, width, height, 1);
			gridMap.addColorToScale(1, Color.BLACK);
			gridMap.addColorToScale(2, Color.GREEN);
			gridMap.addColorToScale(3, Color.CYAN);

			JFrame frame = new JFrame();
			frame.setBounds(0, 0, 840, 865);
			frame.add(gridMap);
			frame.setVisible(true);

			for (int i = 0; i < targetIteration; i++) {
				iterate();
				gridMap.paintBoard.repaint();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			while (true)
				;
		}

		Critter largestEatableCritterInNeighborhood(int x, int y, int crittertype, double size) {
			Critter largestEatableCritter=null;
			double largestSize = 0;
			//moore neighborhood
			for (int dy=y-1; dy <= y+1; dy++) {
				for (int dx=x-1; dx <= x+1; dx++){

					
					
					if (dx==x && dy==y) continue;
					Critter c=crittermap[(dy+height) % height][(dx+width) % width];
					if (c.toProcess==false || c.crittertype!=crittertype)
						continue;
					if (c.size > largestSize && c.size < size) {
						largestEatableCritter=c;
						largestSize=c.size;
					}
				}
		}
			return largestEatableCritter;
		}
		
		Critter freePlaceInNeighborhood(int x, int y) {
			ArrayList<Critter> vacancies=new ArrayList<Critter>();
			//moore neighborhood
			for (int dy=y-1; dy <= y+1; dy++)
				for (int dx=x-1; dx <= x+1; dx++) {
					if (dy==y && dx==x) continue;
					Critter c=crittermap[(dy+height) % height][(dx+width) % width];
					if (c.crittertype==0)
						vacancies.add(c);
				}
			if (vacancies.size()==0) return null;
			//return a random element from the list
			return vacancies.get(rand.nextInt(vacancies.size()));
		}
		
		private void iterate() {
			//sort critter list according to size
			Arrays.sort(allCritters,Collections.reverseOrder());
			//mark critters for processing 
			for (Critter c:allCritters)
				if (c.crittertype==1 || c.crittertype==2)
					c.toProcess=true;
				else
					c.toProcess=false;
			//eating
			for (Critter c:allCritters) {
				Critter largestEatableCritter = largestEatableCritterInNeighborhood(c.x,c.y, 3-c.crittertype, c.size);
				if (largestEatableCritter != null) {
					//feeding time!
					c.energy += largestEatableCritter.energy;
					c.toProcess=false;
					//move to new place
					largestEatableCritter.copyFrom(c);
					//invalidate old place
					c.crittertype = 0;
				}
			}
			//everybody gets basic food, uses food according to size and possible dies 
			for (Critter c:allCritters) {
				if (c.crittertype==1 || c.crittertype==2) {
				  //everybody gets basic food and uses food according to size 
					c.energy += 1.0 - c.size*c.size;
					//starved to death?
					if (c.energy < 0) {
						c.crittertype=0;
					}
				}
			}
			
			//reset toProcess
			for (Critter c:allCritters)
				if (c.crittertype==1 || c.crittertype==2)
					c.toProcess=true;
				else
					c.toProcess=false;
			
			//reproduction
			for (Critter c:allCritters) {
				if (c.toProcess==false) continue;
				if (c.energy > 2*c.size*c.size) {
					Critter offspring = freePlaceInNeighborhood(c.x,c.y);
					if (offspring != null) {
						offspring.offspringOf(c);
						offspring.toProcess=false;
					}
				}
			}
			
			nWerewolves=0;
			nVampires=0;
			for (Critter c:allCritters) {
				if (c.crittertype==1)
					nWerewolves++; 
				else if (c.crittertype==2)
					nVampires++;
			}
				
			
		}
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {

			VampiresAndWerewolves l = new VampiresAndWerewolves();
			l.runSimulaton(11500);
		}

}
