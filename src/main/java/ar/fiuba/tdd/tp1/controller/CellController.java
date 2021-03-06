package ar.fiuba.tdd.tp1.controller;

import ar.fiuba.tdd.tp1.view.GameInputView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.event.MouseInputAdapter;

public class CellController extends MouseInputAdapter {

    private final List<String> validInputs;
    private int cellId;
    private UserInputHandler userInputHandler;
    private boolean deleteButton;

    public CellController(int cellId, List<String> validInputs, UserInputHandler userInputHandler, boolean deleteButton) {
        this.cellId = cellId;
        this.validInputs = validInputs;
        this.userInputHandler = userInputHandler;
        this.deleteButton = deleteButton;
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        GameInputView gameInputView = new GameInputView(event.getXOnScreen(),event.getYOnScreen());
        gameInputView.generateInputButtons(cellId,validInputs, userInputHandler,deleteButton);
        gameInputView.setVisible(true);
    }


}

