/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackni;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author DS-Demabildo
 */
public class stackclass {

    int size, h = 0, t = -1;
    int stackni[] = new int[6];

    public stackclass() {

    }

    void push(int data) {
        t++;
        if (t < 6) {
            stackni[t] = data;
        } else if (t > 5) {
            t = 0;
            stackni[t] = data;
        }
    }

    void pop() {
        stackni[t] = 0;
        t--;
        if (h > 5) {
            h = 0;
        }
    }

    void display() {
        if (t != -1) {
            if (full() == 6) {
                JOptionPane.showMessageDialog(null, "--Stack Activity--\n\nFull Stack!!\n" + Arrays.toString(stackni) + "\n heads @ " + h + "\n tails @ " + t);
            } else {
                JOptionPane.showMessageDialog(null, Arrays.toString(stackni) + "\n heads @ " + h + "\n tails @ " + t);
            }
        } else {
            h = 0;
            t = 0;
            JOptionPane.showMessageDialog(null, "--Stack Activity--\n\nEmpty Stack!!\n" + Arrays.toString(stackni) + "\n heads @ " + h + "\n tails @ " + t);
        }
    }

    int empty() {
        int check = 0, i = 0;
        for (i = 0; i < 6; i++) {
            if (stackni[i] != 0) {
                check = 1;
            }
        }
        return check;
    }

    int full() {
        int check = 0;
        for (int i = 0; i < 6; i++) {
            if (stackni[i] != 0) {
                check++;
            }
        }
        return check;
    }

}
