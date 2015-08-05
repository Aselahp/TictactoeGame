/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

/**
 *
 * @author H.P. Asela
 */
public class Player {

    private boolean playwithcomp;
    private String name;

    public boolean isPlaywithcomp() {
        return playwithcomp;
    }

    public void setPlaywithcomp(boolean playwithcomp) {
        this.playwithcomp = playwithcomp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
