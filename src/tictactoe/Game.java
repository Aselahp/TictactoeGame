/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.util.Random;

/**
 *
 * @author H.P. Asela
 */
public class Game {

    String[][] buttons = new String[3][3];

    Game() {
    }

    public String evaluate(int num) {
        String button = "";
        if (num == 1) {
            while (true) {
                Random rand = new Random();
                int x = rand.nextInt(3);
                int z = rand.nextInt(3);
                if (buttons[x][z] == null) {
                    buttons[x][z] = "O";

                    button = "b" + x + "" + z;
                    break;
                }
            }

        }
        /*if (num == 2) {
            int var = 0;
            while (true) {
                for (int i = 0; i < 3; i++) {
                    if (buttons[i][0] == "O" && buttons[i][1] == "O" && buttons[i][2] == null) {
                        button = "b" + i + "2";
                        buttons[i][2] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][0] == "O" && buttons[i][2] == "O" && buttons[i][1] == null) {
                        button = "b" + i + "1";
                        buttons[i][1] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][1] == "O" && buttons[i][2] == "O" && buttons[i][0] == null) {
                        button = "b" + i + "0";
                        buttons[i][0] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    if (buttons[0][i] == "O" && buttons[1][i] == "O" && buttons[2][i] == null) {
                        button = "b" + "2" + i;
                        buttons[2][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[0][i] == "O" && buttons[2][i] == "O" && buttons[1][i] == null) {
                        button = "b" + "1" + i;
                        buttons[1][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[1][i] == "O" && buttons[2][i] == "O" && buttons[0][i] == null) {
                        button = "b" + "0" + i;
                        buttons[0][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }

                if (buttons[0][0] == "O" && buttons[1][1] == "O" && buttons[2][2] == null) {
                    button = "b22";
                    buttons[2][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][0] == "O" && buttons[2][2] == "O" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][2] == "O" && buttons[1][1] == "O" && buttons[0][0] == null) {
                    button = "b00";
                    buttons[0][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "O" && buttons[1][1] == "O" && buttons[2][0] == null) {
                    button = "b20";
                    buttons[2][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "O" && buttons[2][0] == "O" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][0] == "O" && buttons[1][1] == "O" && buttons[0][2] == null) {
                    button = "b02";
                    buttons[0][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (buttons[i][j] == "O") {
                            if ((i - 1) > 0 && buttons[i - 1][j] == null) {
                                buttons[i - 1][j] = "O";
                                button = "b" + (i - 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((i + 1) < 3 && buttons[i + 1][j] == null) {
                                buttons[i + 1][j] = "O";
                                button = "b" + (i + 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && buttons[i][j - 1] == null) {
                                buttons[i][j - 1] = "O";
                                button = "b" + i + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && buttons[i][j + 1] == null) {
                                buttons[i][j + 1] = "O";
                                button = "b" + i + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && (i - 1) > 0 && buttons[i - 1][j - 1] == null) {
                                buttons[i - 1][j - 1] = "O";
                                button = "b" + (i - 1) + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && (i + 1) < 3 && buttons[i + 1][j + 1] == null) {
                                buttons[i + 1][j + 1] = "O";
                                button = "b" + (i + 1) + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if (buttons[j][i] == null) {
                                buttons[j][i] = "O";
                                button = "b" + j + "" + i;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            }
                        }
                    }
                }
                if (var == 1) {
                    break;
                }
                int l = 0;
                while (l == 0) {
                    Random rand = new Random();
                    int x = rand.nextInt(3);
                    int z = rand.nextInt(3);
                    if (buttons[x][z] == null) {
                        buttons[x][z] = "O";
                        l = 1;
                        button = "b" + x + "" + z;
                        var = 1;
                        break;
                    }

                }
                if (var == 1) {
                    break;
                }
            }
        }*/
        if (num == 3) {
            int var = 0;
            while (true) {
                for (int i = 0; i < 3; i++) {
                    if (buttons[i][0] == "X" && buttons[i][1] == "X" && buttons[i][2] == null) {
                        button = "b" + i + "2";
                        buttons[i][2] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][0] == "X" && buttons[i][2] == "X" && buttons[i][1] == null) {
                        button = "b" + i + "1";
                        buttons[i][1] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][1] == "X" && buttons[i][2] == "X" && buttons[i][0] == null) {
                        button = "b" + i + "0";
                        buttons[i][0] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    if (buttons[0][i] == "X" && buttons[1][i] == "X" && buttons[2][i] == null) {
                        button = "b" + "2" + i;
                        buttons[2][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[0][i] == "X" && buttons[2][i] == "X" && buttons[1][i] == null) {
                        button = "b" + "1" + i;
                        buttons[1][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[1][i] == "X" && buttons[2][i] == "X" && buttons[0][i] == null) {
                        button = "b" + "0" + i;
                        buttons[0][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }

                if (buttons[0][0] == "X" && buttons[1][1] == "X" && buttons[2][2] == null) {
                    button = "b22";
                    buttons[2][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][0] == "X" && buttons[2][2] == "X" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][2] == "X" && buttons[1][1] == "X" && buttons[0][0] == null) {
                    button = "b00";
                    buttons[0][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "X" && buttons[1][1] == "X" && buttons[2][0] == null) {
                    button = "b20";
                    buttons[2][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "X" && buttons[2][0] == "X" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][0] == "X" && buttons[1][1] == "X" && buttons[0][2] == null) {
                    button = "b02";
                    buttons[0][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (buttons[i][j] == "X") {
                            if ((i - 1) > 0 && buttons[i - 1][j] == null) {
                                buttons[i - 1][j] = "O";
                                button = "b" + (i - 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((i + 1) < 3 && buttons[i + 1][j] == null) {
                                buttons[i + 1][j] = "O";
                                button = "b" + (i + 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && buttons[i][j - 1] == null) {
                                buttons[i][j - 1] = "O";
                                button = "b" + i + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && buttons[i][j + 1] == null) {
                                buttons[i][j + 1] = "O";
                                button = "b" + i + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && (i - 1) > 0 && buttons[i - 1][j - 1] == null) {
                                buttons[i - 1][j - 1] = "O";
                                button = "b" + (i - 1) + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && (i + 1) < 3 && buttons[i + 1][j + 1] == null) {
                                buttons[i + 1][j + 1] = "O";
                                button = "b" + (i + 1) + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if (buttons[j][i] == null) {
                                buttons[j][i] = "O";
                                button = "b" + j + "" + i;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            }
                        }
                    }
                }
                if (var == 1) {
                    break;
                }
                int l = 0;
                while (l == 0) {
                    Random rand = new Random();
                    int x = rand.nextInt(3);
                    int z = rand.nextInt(3);
                    if (buttons[x][z] == null) {
                        buttons[x][z] = "O";
                        l = 1;
                        button = "b" + x + "" + z;
                        var = 1;
                        break;
                    }

                }
                if (var == 1) {
                    break;
                }
            }
        }
        if(num==4){
            int var = 0;
            while (true) {
                
                for (int i = 0; i < 3; i++) {
                    if (buttons[i][0] == "O" && buttons[i][1] == "O" && buttons[i][2] == null) {
                        button = "b" + i + "2";
                        buttons[i][2] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][0] == "O" && buttons[i][2] == "O" && buttons[i][1] == null) {
                        button = "b" + i + "1";
                        buttons[i][1] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][1] == "O" && buttons[i][2] == "O" && buttons[i][0] == null) {
                        button = "b" + i + "0";
                        buttons[i][0] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    if (buttons[0][i] == "O" && buttons[1][i] == "O" && buttons[2][i] == null) {
                        button = "b" + "2" + i;
                        buttons[2][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[0][i] == "O" && buttons[2][i] == "O" && buttons[1][i] == null) {
                        button = "b" + "1" + i;
                        buttons[1][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[1][i] == "O" && buttons[2][i] == "O" && buttons[0][i] == null) {
                        button = "b" + "0" + i;
                        buttons[0][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }

                if (buttons[0][0] == "O" && buttons[1][1] == "O" && buttons[2][2] == null) {
                    button = "b22";
                    buttons[2][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][0] == "O" && buttons[2][2] == "O" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][2] == "O" && buttons[1][1] == "O" && buttons[0][0] == null) {
                    button = "b00";
                    buttons[0][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "O" && buttons[1][1] == "O" && buttons[2][0] == null) {
                    button = "b20";
                    buttons[2][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "O" && buttons[2][0] == "O" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][0] == "O" && buttons[1][1] == "O" && buttons[0][2] == null) {
                    button = "b02";
                    buttons[0][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    if (buttons[i][0] == "X" && buttons[i][1] == "X" && buttons[i][2] == null) {
                        button = "b" + i + "2";
                        buttons[i][2] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][0] == "X" && buttons[i][2] == "X" && buttons[i][1] == null) {
                        button = "b" + i + "1";
                        buttons[i][1] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[i][1] == "X" && buttons[i][2] == "X" && buttons[i][0] == null) {
                        button = "b" + i + "0";
                        buttons[i][0] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    if (buttons[0][i] == "X" && buttons[1][i] == "X" && buttons[2][i] == null) {
                        button = "b" + "2" + i;
                        buttons[2][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[0][i] == "X" && buttons[2][i] == "X" && buttons[1][i] == null) {
                        button = "b" + "1" + i;
                        buttons[1][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    } else if (buttons[1][i] == "X" && buttons[2][i] == "X" && buttons[0][i] == null) {
                        button = "b" + "0" + i;
                        buttons[0][i] = "O";
                        var = 1;
                        break;
                    }
                    if (var == 1) {
                        break;
                    }
                }
                if (var == 1) {
                    break;
                }

                if (buttons[0][0] == "X" && buttons[1][1] == "X" && buttons[2][2] == null) {
                    button = "b22";
                    buttons[2][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][0] == "X" && buttons[2][2] == "X" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][2] == "X" && buttons[1][1] == "X" && buttons[0][0] == null) {
                    button = "b00";
                    buttons[0][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "X" && buttons[1][1] == "X" && buttons[2][0] == null) {
                    button = "b20";
                    buttons[2][0] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[0][2] == "X" && buttons[2][0] == "X" && buttons[1][1] == null) {
                    button = "b11";
                    buttons[1][1] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                if (buttons[2][0] == "X" && buttons[1][1] == "X" && buttons[0][2] == null) {
                    button = "b02";
                    buttons[0][2] = "O";
                    var = 1;
                }
                if (var == 1) {
                    break;
                }
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (buttons[i][j] == "O") {
                            if ((i - 1) > 0 && buttons[i - 1][j] == null) {
                                buttons[i - 1][j] = "O";
                                button = "b" + (i - 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((i + 1) < 3 && buttons[i + 1][j] == null) {
                                buttons[i + 1][j] = "O";
                                button = "b" + (i + 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && buttons[i][j - 1] == null) {
                                buttons[i][j - 1] = "O";
                                button = "b" + i + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && buttons[i][j + 1] == null) {
                                buttons[i][j + 1] = "O";
                                button = "b" + i + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && (i - 1) > 0 && buttons[i - 1][j - 1] == null) {
                                buttons[i - 1][j - 1] = "O";
                                button = "b" + (i - 1) + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && (i + 1) < 3 && buttons[i + 1][j + 1] == null) {
                                buttons[i + 1][j + 1] = "O";
                                button = "b" + (i + 1) + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if (buttons[j][i] == null) {
                                buttons[j][i] = "O";
                                button = "b" + j + "" + i;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            }
                        }
                    }
                }
                if (var == 1) {
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (buttons[i][j] == "X") {
                            if ((i - 1) > 0 && buttons[i - 1][j] == null) {
                                buttons[i - 1][j] = "O";
                                button = "b" + (i - 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((i + 1) < 3 && buttons[i + 1][j] == null) {
                                buttons[i + 1][j] = "O";
                                button = "b" + (i + 1) + "" + j;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && buttons[i][j - 1] == null) {
                                buttons[i][j - 1] = "O";
                                button = "b" + i + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && buttons[i][j + 1] == null) {
                                buttons[i][j + 1] = "O";
                                button = "b" + i + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j - 1) > 0 && (i - 1) > 0 && buttons[i - 1][j - 1] == null) {
                                buttons[i - 1][j - 1] = "O";
                                button = "b" + (i - 1) + "" + (j - 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if ((j + 1) < 3 && (i + 1) < 3 && buttons[i + 1][j + 1] == null) {
                                buttons[i + 1][j + 1] = "O";
                                button = "b" + (i + 1) + "" + (j + 1);
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            } else if (buttons[j][i] == null) {
                                buttons[j][i] = "O";
                                button = "b" + j + "" + i;
                                var = 1;
                                break;
                            }
                            if (var == 1) {
                                break;
                            }
                        }
                    }
                }
                if (var == 1) {
                    break;
                }
                int l = 0;
                while (l == 0) {
                    Random rand = new Random();
                    int x = rand.nextInt(3);
                    int z = rand.nextInt(3);
                    if (buttons[x][z] == null) {
                        buttons[x][z] = "O";
                        l = 1;
                        button = "b" + x + "" + z;
                        var = 1;
                        break;
                    }

                }
                if (var == 1) {
                    break;
                }
        }
        }
        return button;

    }

}
