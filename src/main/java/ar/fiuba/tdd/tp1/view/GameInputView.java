package ar.fiuba.tdd.tp1.view;

import ar.fiuba.tdd.tp1.controller.DeleteButtonController;
import ar.fiuba.tdd.tp1.controller.GameButtonController;
import ar.fiuba.tdd.tp1.model.Cell;

import java.awt.*;
import javax.swing.*;

public class GameInputView extends JDialog {

    public GameInputView(int posX, int posY) {
        super();
        this.setTitle("Select value");
        this.setBounds(posX, posY, 300, 100);
        this.setLayout(new FlowLayout());
    }

    public void generateInputButtons() {
        for (int i = 1; i < 10 ; i++) {
            this.add(new InputGameButton(Integer.toString(i), new GameButtonController()));
        }
        this.add(new InputDeleteButton("Delete", new DeleteButtonController()));
    }
}