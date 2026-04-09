/*
 * ConnectFour.java
 *
 * Created on 26.09.2011, 16:40:24
 */
package examplesOld.connectfour;

import jGridMap.JGridMap;
import jGridMap.JGridMap.JGridMapKeyEvent;
import jGridMap.JGridMap.JGridMapMouseEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * Not supported any more. x/y changed.
 *
 * @author Tobi
 */
public class ConnectFour2 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private int[][] data = new int[9][8];
    private JGridMap jgm = null;
    private boolean redTurn = true;

    /** Creates new form ConnectFour */
    /**
     * 
     */
    public ConnectFour2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jgm = new JGridMap(900, 700, 9, 8, 0);
        String path = "examplesData/connectFour/";
        jgm.addImageToScale(1, path+"starcoinRed.png", false);
        jgm.addImageToScale(2, path+"starcoinYellow.png", false);
        jgm.addImageToScale(3, path+"starcoinRed.png", true);
        jgm.addImageToScale(4, path+"starcoinYellow.png", true);
        data[0][7] = 3;
        data[8][7] = 2;
        jgm.setData(data);
        setSize(new Dimension(960, 780));
        jgm.setPreferredSize(new Dimension(900, 700));
        gridMapLisener();
        add(jgm);
        jgm.setVisible(true);
        setLocationRelativeTo(null);
        setVisible(true);
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        @SuppressWarnings("unused")
				ConnectFour2 cf = new ConnectFour2();
    }

    private void gridMapLisener() {
        jgm.addEventListener(new JGridMap.JGridMapEventListener() {

            @Override
            public void handleJGridMapMouseEvent(JGridMapMouseEvent e) {
                switch (e.getType()) {
                    case leftRelease:
                        dragEvent(e);
                        break;
                }
            }

            private void dragEvent(JGridMapMouseEvent e) {
                if (e.getCurrent().y == 0 && e.getCurrent().x >= 1 && e.getCurrent().x <= 7) {
                    if (data[e.getCurrent().x][1] == 0 && data[e.getOrigin().x][e.getOrigin().y] >= 3) {
                        for (int i = 7; i >= 1; i--) {
                            if (data[e.getCurrent().x][i] == 0) {
                                data[e.getCurrent().x][i] = data[e.getOrigin().x][e.getOrigin().y];
                                changeTurn();
                                jgm.setData(data);
                                checkWin();
                                repaint();
                                return;
                            }
                        }
                    }
                }
            }

            private void changeTurn() {
                if (redTurn) {
                    data[0][7] = 1;
                    data[8][7] = 4;
                } else {
                    data[0][7] = 3;
                    data[8][7] = 2;
                }
                redTurn = !redTurn;
            }

            private void checkWin() {
                @SuppressWarnings("unused")
								int one = 0;
                @SuppressWarnings("unused")
								int two = 0;
                for (int x = 1; x <= 7; x++) {
                    for (int y = 1; y <= 6; y++) {
                        if (data[x][y] == 1) {
                            if (one++ == 4) {
                                //win(1);
                            }
                            two = 0;
                        } else if (data[x][y] == 2) {
                            if (two++ == 4) {
                                //win(2);
                            }
                            one = 0;
                        } else if (data[x][y] == 0) {
                            two = 0;
                            one = 0;
                        }
                    }
                }
                for (int y = 1; y <= 6; y++) {
                    for (int x = 1; x <= 7; x++) {

                        if (data[x][y] == 1) {
                            if (one++ == 4) {
                                //win(1);
                            }
                            two = 0;
                        } else if (data[x][y] == 2) {
                            if (two++ == 4) {
                                //win(2);
                            }
                            one = 0;
                        } else if (data[x][y] == 0) {
                            two = 0;
                            one = 0;
                        }
                    }
                }
                for (int j = 4; j <= 6; j++) {
                    for (int i = 0; i <= j - 1; i++) {
                        int x = 1 + i;
                        int y = j - i;
                        if (data[x][y] == 1) {
                            if (one++ == 4) {
                                //win(1);
                            }
                            two = 0;
                        } else if (data[x][y] == 2) {
                            if (two++ == 4) {
                                //win(2);
                            }
                            one = 0;
                        } else if (data[x][y] == 0) {
                            two = 0;
                            one = 0;
                        }
                    }
                }
                for (int j = 2; j <= 4; j++) {
                    for (int i = 0; i <= 7-j; i++) {
                        int x = 1 + i;
                        int y = j - i;
                        if (data[x][y] == 1) {
                            if (one++ == 4) {
                                //win(1);
                            }
                            two = 0;
                        } else if (data[x][y] == 2) {
                            if (two++ == 4) {
                                //win(2);
                            }
                            one = 0;
                        } else if (data[x][y] == 0) {
                            two = 0;
                            one = 0;
                        }
                    }
                }
                //diagonal 2
                for (int j = 4; j <= 6; j++) {
                    for (int i = 0; i <= j - 1; i++) {
                        int x = 1 + i;
                        int y = j - i;
                        if (data[x][y] == 1) {
                            if (one++ == 4) {
                                //win(1);
                            }
                            two = 0;
                        } else if (data[x][y] == 2) {
                            if (two++ == 4) {
                                //win(2);
                            }
                            one = 0;
                        } else if (data[x][y] == 0) {
                            two = 0;
                            one = 0;
                        }
                    }
                }
                for (int j = 2; j <= 4; j++) {
                    for (int i = 0; i <= 7-j; i++) {
                        int x = 1 + i;
                        int y = j - i;
                        if (data[x][y] == 1) {
                            if (one++ == 4) {
                                //win(1);
                            }
                            two = 0;
                        } else if (data[x][y] == 2) {
                            if (two++ == 4) {
                                //win(2);
                            }
                            one = 0;
                        } else if (data[x][y] == 0) {
                            two = 0;
                            one = 0;
                        }
                    }
                }
            }
            
            @SuppressWarnings("unused")
						public void win(){
                
            }

						@Override
						public void handleJGridMapKeyBoardEvent(JGridMapKeyEvent e) {
							// TODO Auto-generated method stub
							
						}
           
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) jgm.paintBoard.getGraphics();
        g2d.setColor(Color.BLACK);
        int scale = jgm.getZoomScale();
        for (int iw = 1; iw <= 8; iw++) {
            g2d.drawLine(iw * scale, scale, iw * scale, 8 * scale);
        }
        for (int ih = 1; ih <= 8; ih++) {
            g2d.drawLine(scale, ih * scale, 8 * scale, ih * scale);
        }
    }
}
