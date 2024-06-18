import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Keyboard implements ActionListener {
    public JPanel keyboard;
    public JButton qButton;
    public JButton wButton;
    public JButton eButton;
    public JButton rButton;
    public JButton tButton;
    public JButton yButton;
    public JButton uButton;
    public JButton iButton;
    public JButton oButton;
    public JButton pButton;
    public JButton aButton;
    public JButton sButton;
    public JButton dButton;
    public JButton fButton;
    public JButton gButton;
    public JButton hButton;
    public JButton jButton;
    public JButton kButton;
    public JButton lButton;
    public JButton zButton;
    public JButton xButton;
    public JButton cButton;
    public JButton vButton;
    public JButton bButton;
    public JButton nButton;
    public JButton mButton;
    public JButton enterButton;
    public JButton delButton;
    public Player player1;
    public GameBoard wordleGameBoard;
    public ArrayList<JButton> greenButtons;
    public ArrayList<JButton> yellowButtons;

    public Keyboard () {

    }
    public void resetKeyboard (Player thePlayer, GameBoard wordleGameBoard) {
        keyboard = new JPanel();
        keyboard.setLayout(null);
        keyboard.setPreferredSize(new Dimension(600, 225));
        player1 = thePlayer;
        this.wordleGameBoard = wordleGameBoard;

        qButton = FrameObjects.createButton(27, 28, 50, 50, "Q", "Times New Romans", 20, Color.LIGHT_GRAY);
        qButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(qButton);
        qButton.setVisible(true);

        wButton = FrameObjects.createButton(82, 28, 51, 50, "W", "Times New Romans", 18, Color.LIGHT_GRAY);
        wButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(wButton);
        wButton.setVisible(true);

        eButton = FrameObjects.createButton(138, 28, 50, 50, "E", "Times New Romans", 20, Color.LIGHT_GRAY);
        eButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(eButton);
        eButton.setVisible(true);

        rButton = FrameObjects.createButton(193, 28, 50, 50, "R", "Times New Romans", 20, Color.LIGHT_GRAY);
        rButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(rButton);
        rButton.setVisible(true);

        tButton = FrameObjects.createButton(248, 28, 50, 50, "T", "Times New Romans", 20, Color.LIGHT_GRAY);
        tButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(tButton);
        tButton.setVisible(true);

        yButton = FrameObjects.createButton(303, 28, 50, 50, "Y", "Times New Romans", 20, Color.LIGHT_GRAY);
        yButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(yButton);
        yButton.setVisible(true);

        uButton = FrameObjects.createButton(358, 28, 50, 50, "U", "Times New Romans", 20, Color.LIGHT_GRAY);
        uButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(uButton);
        uButton.setVisible(true);

        iButton = FrameObjects.createButton(413, 28, 50, 50, "I", "Times New Romans", 20, Color.LIGHT_GRAY);
        iButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(iButton);
        iButton.setVisible(true);

        oButton = FrameObjects.createButton(468, 28, 50, 50, "O", "Times New Romans", 20, Color.LIGHT_GRAY);
        oButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(oButton);
        oButton.setVisible(true);

        pButton = FrameObjects.createButton(523, 28, 50, 50, "P", "Times New Romans", 20, Color.LIGHT_GRAY);
        pButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(pButton);
        pButton.setVisible(true);

        aButton = FrameObjects.createButton(55, 88, 50, 50, "A", "Times New Romans", 20, Color.LIGHT_GRAY);
        aButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(aButton);
        aButton.setVisible(true);

        sButton = FrameObjects.createButton(110, 88, 50, 50, "S", "Times New Romans", 20, Color.LIGHT_GRAY);
        sButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(sButton);
        sButton.setVisible(true);

        dButton = FrameObjects.createButton(165, 88, 50, 50, "D", "Times New Romans", 20, Color.LIGHT_GRAY);
        dButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(dButton);
        dButton.setVisible(true);

        fButton = FrameObjects.createButton(220, 88, 50, 50, "F", "Times New Romans", 20, Color.LIGHT_GRAY);
        fButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(fButton);
        fButton.setVisible(true);

        gButton = FrameObjects.createButton(275, 88, 50, 50, "G", "Times New Romans", 20, Color.LIGHT_GRAY);
        gButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(gButton);
        gButton.setVisible(true);

        hButton = FrameObjects.createButton(330, 88, 50, 50, "H", "Times New Romans", 20, Color.LIGHT_GRAY);
        hButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(hButton);
        hButton.setVisible(true);

        jButton = FrameObjects.createButton(385, 88, 50, 50, "J", "Times New Romans", 20, Color.LIGHT_GRAY);
        jButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(jButton);
        jButton.setVisible(true);

        kButton = FrameObjects.createButton(440, 88, 50, 50, "K", "Times New Romans", 20, Color.LIGHT_GRAY);
        kButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(kButton);
        kButton.setVisible(true);

        lButton = FrameObjects.createButton(495, 88, 50, 50, "L", "Times New Romans", 20, Color.LIGHT_GRAY);
        lButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(lButton);
        lButton.setVisible(true);

        zButton = FrameObjects.createButton(110, 148, 50, 50, "Z", "Times New Romans", 20, Color.LIGHT_GRAY);
        zButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(zButton);
        zButton.setVisible(true);

        xButton = FrameObjects.createButton(165, 148, 50, 50, "X", "Times New Romans", 20, Color.LIGHT_GRAY);
        xButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(xButton);
        xButton.setVisible(true);

        cButton = FrameObjects.createButton(220, 148, 50, 50, "C", "Times New Romans", 20, Color.LIGHT_GRAY);
        cButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(cButton);
        cButton.setVisible(true);

        vButton = FrameObjects.createButton(275, 148, 50, 50, "V", "Times New Romans", 20, Color.LIGHT_GRAY);
        vButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(vButton);
        vButton.setVisible(true);

        bButton = FrameObjects.createButton(330, 148, 50, 50, "B", "Times New Romans", 20, Color.LIGHT_GRAY);
        bButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(bButton);
        bButton.setVisible(true);

        nButton = FrameObjects.createButton(385, 148, 50, 50, "N", "Times New Romans", 20, Color.LIGHT_GRAY);
        nButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(nButton);
        nButton.setVisible(true);

        mButton = FrameObjects.createButton(440, 148, 51, 50, "M", "Times New Romans", 20, Color.LIGHT_GRAY);
        mButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(mButton);
        mButton.setVisible(true);

        enterButton = FrameObjects.createButton(25, 148, 80, 50, "ENTER", "Times New Romans", 13, Color.LIGHT_GRAY);
        enterButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(enterButton);
        enterButton.setVisible(true);

        delButton = FrameObjects.createButton(495, 148, 80, 50, "DEL", "Times New Romans", 13, Color.LIGHT_GRAY);
        delButton.setBackground(Color.LIGHT_GRAY);
        keyboard.add(delButton);
        delButton.setVisible(true);

        greenButtons = new ArrayList<>();
        yellowButtons = new ArrayList<>();

        aButton.addActionListener(this);
        bButton.addActionListener(this);
        cButton.addActionListener(this);
        dButton.addActionListener(this);
        eButton.addActionListener(this);
        fButton.addActionListener(this);
        gButton.addActionListener(this);
        hButton.addActionListener(this);
        iButton.addActionListener(this);
        jButton.addActionListener(this);
        kButton.addActionListener(this);
        lButton.addActionListener(this);
        mButton.addActionListener(this);
        nButton.addActionListener(this);
        oButton.addActionListener(this);
        pButton.addActionListener(this);
        qButton.addActionListener(this);
        rButton.addActionListener(this);
        sButton.addActionListener(this);
        tButton.addActionListener(this);
        uButton.addActionListener(this);
        vButton.addActionListener(this);
        wButton.addActionListener(this);
        xButton.addActionListener(this);
        yButton.addActionListener(this);
        zButton.addActionListener(this);
        enterButton.addActionListener(this);
        delButton.addActionListener(this);
    }
    public JPanel getKeyboard () {
        return keyboard;
    }

    public void sendGuessResults (String results, String guess) {
        int i = 0;
        while(i < 5) {
            if (results.charAt(i) == 'G') {
                switch (guess.substring(i, i + 1)) {
                    case "A" -> {
                        aButton.setBackground(new Color(106, 170, 100));
                        aButton.setForeground(Color.WHITE);
                        greenButtons.add(aButton);
                        i++;
                    }
                    case "B" -> {
                        bButton.setBackground(new Color(106, 170, 100));
                        bButton.setForeground(Color.WHITE);
                        greenButtons.add(bButton);
                        i++;
                    }
                    case "C" -> {
                        cButton.setBackground(new Color(106, 170, 100));
                        cButton.setForeground(Color.WHITE);
                        greenButtons.add(cButton);
                        i++;
                    }
                    case "D" -> {
                        dButton.setBackground(new Color(106, 170, 100));
                        dButton.setForeground(Color.WHITE);
                        greenButtons.add(dButton);
                        i++;
                    }
                    case "E" -> {
                        eButton.setBackground(new Color(106, 170, 100));
                        eButton.setForeground(Color.WHITE);
                        greenButtons.add(eButton);
                        i++;
                    }
                    case "F" -> {
                        fButton.setBackground(new Color(106, 170, 100));
                        fButton.setForeground(Color.WHITE);
                        greenButtons.add(fButton);
                        i++;
                    }
                    case "G" -> {
                        gButton.setBackground(new Color(106, 170, 100));
                        gButton.setForeground(Color.WHITE);
                        greenButtons.add(gButton);
                        i++;
                    }
                    case "H" -> {
                        hButton.setBackground(new Color(106, 170, 100));
                        hButton.setForeground(Color.WHITE);
                        greenButtons.add(hButton);
                        i++;
                    }
                    case "I" -> {
                        iButton.setBackground(new Color(106, 170, 100));
                        iButton.setForeground(Color.WHITE);
                        greenButtons.add(iButton);
                        i++;
                    }
                    case "J" -> {
                        jButton.setBackground(new Color(106, 170, 100));
                        jButton.setForeground(Color.WHITE);
                        greenButtons.add(jButton);
                        i++;
                    }
                    case "K" -> {
                        kButton.setBackground(new Color(106, 170, 100));
                        kButton.setForeground(Color.WHITE);
                        greenButtons.add(kButton);
                        i++;
                    }
                    case "L" -> {
                        lButton.setBackground(new Color(106, 170, 100));
                        lButton.setForeground(Color.WHITE);
                        greenButtons.add(lButton);
                        i++;
                    }
                    case "M" -> {
                        mButton.setBackground(new Color(106, 170, 100));
                        mButton.setForeground(Color.WHITE);
                        greenButtons.add(mButton);
                        i++;
                    }
                    case "N" -> {
                        nButton.setBackground(new Color(106, 170, 100));
                        nButton.setForeground(Color.WHITE);
                        greenButtons.add(nButton);
                        i++;
                    }
                    case "O" -> {
                        oButton.setBackground(new Color(106, 170, 100));
                        oButton.setForeground(Color.WHITE);
                        greenButtons.add(oButton);
                        i++;
                    }
                    case "P" -> {
                        pButton.setBackground(new Color(106, 170, 100));
                        pButton.setForeground(Color.WHITE);
                        greenButtons.add(pButton);
                        i++;
                    }
                    case "Q" -> {
                        qButton.setBackground(new Color(106, 170, 100));
                        qButton.setForeground(Color.WHITE);
                        greenButtons.add(qButton);
                        i++;
                    }
                    case "R" -> {
                        rButton.setBackground(new Color(106, 170, 100));
                        rButton.setForeground(Color.WHITE);
                        greenButtons.add(rButton);
                        i++;
                    }
                    case "S" -> {
                        sButton.setBackground(new Color(106, 170, 100));
                        sButton.setForeground(Color.WHITE);
                        greenButtons.add(sButton);
                        i++;
                    }
                    case "T" -> {
                        tButton.setBackground(new Color(106, 170, 100));
                        tButton.setForeground(Color.WHITE);
                        greenButtons.add(tButton);
                        i++;
                    }
                    case "U" -> {
                        uButton.setBackground(new Color(106, 170, 100));
                        uButton.setForeground(Color.WHITE);
                        greenButtons.add(uButton);
                        i++;
                    }
                    case "V" -> {
                        vButton.setBackground(new Color(106, 170, 100));
                        vButton.setForeground(Color.WHITE);
                        greenButtons.add(vButton);
                        i++;
                    }
                    case "W" -> {
                        wButton.setBackground(new Color(106, 170, 100));
                        wButton.setForeground(Color.WHITE);
                        greenButtons.add(wButton);
                        i++;
                    }
                    case "X" -> {
                        xButton.setBackground(new Color(106, 170, 100));
                        xButton.setForeground(Color.WHITE);
                        greenButtons.add(xButton);
                        i++;
                    }
                    case "Y" -> {
                        yButton.setBackground(new Color(106, 170, 100));
                        yButton.setForeground(Color.WHITE);
                        greenButtons.add(yButton);
                        i++;
                    }
                    case "Z" -> {
                        zButton.setBackground(new Color(106, 170, 100));
                        zButton.setForeground(Color.WHITE);
                        greenButtons.add(zButton);
                        i++;
                    }
                }
            }
            else if (results.charAt(i) == 'Y') {
                switch (guess.substring(i, i + 1)) {
                    case "A" -> {
                        if (checkIfNotFilled(greenButtons, aButton)) {
                            aButton.setBackground(new Color(201, 180, 88));
                            aButton.setForeground(Color.WHITE);
                            yellowButtons.add(aButton);
                        }
                        i++;
                    }
                    case "B" -> {
                        if (checkIfNotFilled(greenButtons, bButton)) {
                            bButton.setBackground(new Color(201, 180, 88));
                            bButton.setForeground(Color.WHITE);
                            yellowButtons.add(bButton);
                        }
                        i++;
                    }
                    case "C" -> {
                        if (checkIfNotFilled(greenButtons, cButton)) {
                            cButton.setBackground(new Color(201, 180, 88));
                            cButton.setForeground(Color.WHITE);
                            yellowButtons.add(cButton);
                        }
                        i++;
                    }
                    case "D" -> {
                        if (checkIfNotFilled(greenButtons, dButton)) {
                            dButton.setBackground(new Color(201, 180, 88));
                            dButton.setForeground(Color.WHITE);
                            yellowButtons.add(dButton);
                        }
                        i++;
                    }
                    case "E" -> {
                        if (checkIfNotFilled(greenButtons, eButton)) {
                            eButton.setBackground(new Color(201, 180, 88));
                            eButton.setForeground(Color.WHITE);
                            yellowButtons.add(eButton);
                        }
                        i++;
                    }
                    case "F" -> {
                        if (checkIfNotFilled(greenButtons, fButton)) {
                            fButton.setBackground(new Color(201, 180, 88));
                            fButton.setForeground(Color.WHITE);
                            yellowButtons.add(fButton);
                        }
                        i++;
                    }
                    case "G" -> {
                        if (checkIfNotFilled(greenButtons, gButton)) {
                            gButton.setBackground(new Color(201, 180, 88));
                            gButton.setForeground(Color.WHITE);
                            yellowButtons.add(gButton);
                        }
                        i++;
                    }
                    case "H" -> {
                        if (checkIfNotFilled(greenButtons, hButton)) {
                            hButton.setBackground(new Color(201, 180, 88));
                            hButton.setForeground(Color.WHITE);
                            yellowButtons.add(hButton);
                        }
                        i++;
                    }
                    case "I" -> {
                        if (checkIfNotFilled(greenButtons, iButton)) {
                            iButton.setBackground(new Color(201, 180, 88));
                            iButton.setForeground(Color.WHITE);
                            yellowButtons.add(iButton);
                        }
                        i++;
                    }
                    case "J" -> {
                        if (checkIfNotFilled(greenButtons, jButton)) {
                            jButton.setBackground(new Color(201, 180, 88));
                            jButton.setForeground(Color.WHITE);
                            yellowButtons.add(jButton);
                            }
                        i++;
                    }
                    case "K" -> {
                        if (checkIfNotFilled(greenButtons, kButton)) {
                            kButton.setBackground(new Color(201, 180, 88));
                            kButton.setForeground(Color.WHITE);
                            yellowButtons.add(kButton);
                            }
                        i++;
                    }
                    case "L" -> {
                        if (checkIfNotFilled(greenButtons, lButton)) {
                            lButton.setBackground(new Color(201, 180, 88));
                            lButton.setForeground(Color.WHITE);
                            yellowButtons.add(lButton);
                            }
                        i++;
                    }
                    case "M" -> {
                        if (checkIfNotFilled(greenButtons, mButton)) {
                            mButton.setBackground(new Color(201, 180, 88));
                            mButton.setForeground(Color.WHITE);
                            yellowButtons.add(mButton);
                            }
                        i++;
                    }
                    case "N" -> {
                        if (checkIfNotFilled(greenButtons, nButton)) {
                            nButton.setBackground(new Color(201, 180, 88));
                            nButton.setForeground(Color.WHITE);
                            yellowButtons.add(nButton);
                            }
                        i++;
                    }
                    case "O" -> {
                        if (checkIfNotFilled(greenButtons, oButton)) {
                            oButton.setBackground(new Color(201, 180, 88));
                            oButton.setForeground(Color.WHITE);
                            yellowButtons.add(oButton);
                            }
                        i++;
                    }
                    case "P" -> {
                        if (checkIfNotFilled(greenButtons, pButton)) {
                            pButton.setBackground(new Color(201, 180, 88));
                            pButton.setForeground(Color.WHITE);
                            yellowButtons.add(pButton);
                            }
                        i++;
                    }
                    case "Q" -> {
                        if (checkIfNotFilled(greenButtons, qButton)) {
                            qButton.setBackground(new Color(201, 180, 88));
                            qButton.setForeground(Color.WHITE);
                            yellowButtons.add(qButton);
                            }
                        i++;
                    }
                    case "R" -> {
                        if (checkIfNotFilled(greenButtons, rButton)) {
                            rButton.setBackground(new Color(201, 180, 88));
                            rButton.setForeground(Color.WHITE);
                            yellowButtons.add(rButton);
                            }
                        i++;
                    }
                    case "S" -> {
                        if (checkIfNotFilled(greenButtons, sButton)) {
                            sButton.setBackground(new Color(201, 180, 88));
                            sButton.setForeground(Color.WHITE);
                            yellowButtons.add(sButton);
                            }
                        i++;
                    }
                    case "T" -> {
                        if (checkIfNotFilled(greenButtons, tButton)) {
                            tButton.setBackground(new Color(201, 180, 88));
                            tButton.setForeground(Color.WHITE);
                            yellowButtons.add(tButton);
                            }
                        i++;
                    }
                    case "U" -> {
                        if (checkIfNotFilled(greenButtons, uButton)) {
                            uButton.setBackground(new Color(201, 180, 88));
                            uButton.setForeground(Color.WHITE);
                            yellowButtons.add(uButton);
                            }
                        i++;
                    }
                    case "V" -> {
                        if (checkIfNotFilled(greenButtons, vButton)) {
                            vButton.setBackground(new Color(201, 180, 88));
                            vButton.setForeground(Color.WHITE);
                            yellowButtons.add(vButton);
                            }
                        i++;
                    }
                    case "W" -> {
                        if (checkIfNotFilled(greenButtons, wButton)) {
                            wButton.setBackground(new Color(201, 180, 88));
                            wButton.setForeground(Color.WHITE);
                            yellowButtons.add(wButton);
                            }
                        i++;
                    }
                    case "X" -> {
                        if (checkIfNotFilled(greenButtons, xButton)) {
                            xButton.setBackground(new Color(201, 180, 88));
                            xButton.setForeground(Color.WHITE);
                            yellowButtons.add(xButton);
                            }
                        i++;
                    }
                    case "Y" -> {
                        if (checkIfNotFilled(greenButtons, yButton)) {
                            yButton.setBackground(new Color(201, 180, 88));
                            yButton.setForeground(Color.WHITE);
                            yellowButtons.add(yButton);
                            }
                        i++;
                    }
                    case "Z" -> {
                        if (checkIfNotFilled(greenButtons, zButton)) {
                            zButton.setBackground(new Color(201, 180, 88));
                            zButton.setForeground(Color.WHITE);
                            yellowButtons.add(zButton);
                            }
                        i++;
                    }
                }
            }
            else {
                switch (guess.substring(i, i + 1)) {
                    case "A" -> {
                        if (checkIfNotFilled(greenButtons, aButton) && checkIfNotFilled(yellowButtons, aButton)) {
                            aButton.setBackground(new Color(120, 124, 126));
                            aButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "B" -> {
                        if (checkIfNotFilled(greenButtons, bButton) && checkIfNotFilled(yellowButtons, bButton)) {
                            bButton.setBackground(new Color(120, 124, 126));
                            bButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "C" -> {
                        if (checkIfNotFilled(greenButtons, cButton) && checkIfNotFilled(yellowButtons, cButton)) {
                            cButton.setBackground(new Color(120, 124, 126));
                            cButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "D" -> {
                        if (checkIfNotFilled(greenButtons, dButton) && checkIfNotFilled(yellowButtons, dButton)) {
                            dButton.setBackground(new Color(120, 124, 126));
                            dButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "E" -> {
                        if (checkIfNotFilled(greenButtons, eButton) && checkIfNotFilled(yellowButtons, eButton)) {
                            eButton.setBackground(new Color(120, 124, 126));
                            eButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "F" -> {
                        if (checkIfNotFilled(greenButtons, fButton) && checkIfNotFilled(yellowButtons, fButton)) {
                            fButton.setBackground(new Color(120, 124, 126));
                            fButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "G" -> {
                        if (checkIfNotFilled(greenButtons, gButton) && checkIfNotFilled(yellowButtons, gButton)) {
                            gButton.setBackground(new Color(120, 124, 126));
                            gButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "H" -> {
                        if (checkIfNotFilled(greenButtons, hButton) && checkIfNotFilled(yellowButtons, hButton)) {
                            hButton.setBackground(new Color(120, 124, 126));
                            hButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "I" -> {
                        if (checkIfNotFilled(greenButtons, iButton) && checkIfNotFilled(yellowButtons, iButton)) {
                            iButton.setBackground(new Color(120, 124, 126));
                            iButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "J" -> {
                        if (checkIfNotFilled(greenButtons, jButton) && checkIfNotFilled(yellowButtons, jButton)) {
                            jButton.setBackground(new Color(120, 124, 126));
                            jButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "K" -> {
                        if (checkIfNotFilled(greenButtons, kButton) && checkIfNotFilled(yellowButtons, kButton)) {
                            kButton.setBackground(new Color(120, 124, 126));
                            kButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "L" -> {
                        if (checkIfNotFilled(greenButtons, lButton) && checkIfNotFilled(yellowButtons, lButton)) {
                            lButton.setBackground(new Color(120, 124, 126));
                            lButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "M" -> {
                        if (checkIfNotFilled(greenButtons, mButton) && checkIfNotFilled(yellowButtons, mButton)) {
                            mButton.setBackground(new Color(120, 124, 126));
                            mButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "N" -> {
                        if (checkIfNotFilled(greenButtons, nButton) && checkIfNotFilled(yellowButtons, nButton)) {
                            nButton.setBackground(new Color(120, 124, 126));
                            nButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "O" -> {
                        if (checkIfNotFilled(greenButtons, oButton) && checkIfNotFilled(yellowButtons, oButton)) {
                            oButton.setBackground(new Color(120, 124, 126));
                            oButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "P" -> {
                        if (checkIfNotFilled(greenButtons, pButton) && checkIfNotFilled(yellowButtons, pButton)) {
                            pButton.setBackground(new Color(120, 124, 126));
                            pButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "Q" -> {
                        if (checkIfNotFilled(greenButtons, qButton) && checkIfNotFilled(yellowButtons, qButton)) {
                            qButton.setBackground(new Color(120, 124, 126));
                            qButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "R" -> {
                        if (checkIfNotFilled(greenButtons, rButton) && checkIfNotFilled(yellowButtons, rButton)) {
                            rButton.setBackground(new Color(120, 124, 126));
                            rButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "S" -> {
                        if (checkIfNotFilled(greenButtons, sButton) && checkIfNotFilled(yellowButtons, sButton)) {
                            sButton.setBackground(new Color(120, 124, 126));
                            sButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "T" -> {
                        if (checkIfNotFilled(greenButtons, tButton) && checkIfNotFilled(yellowButtons, tButton)) {
                            tButton.setBackground(new Color(120, 124, 126));
                            tButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "U" -> {
                        if (checkIfNotFilled(greenButtons, uButton) && checkIfNotFilled(yellowButtons, uButton)) {
                            uButton.setBackground(new Color(120, 124, 126));
                            uButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "V" -> {
                        if (checkIfNotFilled(greenButtons, vButton) && checkIfNotFilled(yellowButtons, vButton)) {
                            vButton.setBackground(new Color(120, 124, 126));
                            vButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "W" -> {
                        if (checkIfNotFilled(greenButtons, wButton) && checkIfNotFilled(yellowButtons, wButton)) {
                            wButton.setBackground(new Color(120, 124, 126));
                            wButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "X" -> {
                        if (checkIfNotFilled(greenButtons, xButton) && checkIfNotFilled(yellowButtons, xButton)) {
                            xButton.setBackground(new Color(120, 124, 126));
                            xButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "Y" -> {
                        if (checkIfNotFilled(greenButtons, yButton) && checkIfNotFilled(yellowButtons, yButton)) {
                            yButton.setBackground(new Color(120, 124, 126));
                            yButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                    case "Z" -> {
                        if (checkIfNotFilled(greenButtons, zButton) && checkIfNotFilled(yellowButtons, zButton)) {
                            zButton.setBackground(new Color(120, 124, 126));
                            zButton.setForeground(Color.WHITE);
                            }
                        i++;
                    }
                }
            }
        }
    }

    public boolean checkIfNotFilled(ArrayList<JButton> array, JButton button) {
        for (JButton value : array) {
            if (value == button) {
                return false;
            }
        }
        return true;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == qButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "Q");
        }
        else if (e.getSource() == wButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "W");
        }
        else if (e.getSource() == eButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "E");
        }
        else if (e.getSource() == rButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "R");
        }
        else if (e.getSource() == tButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "T");
        }
        else if (e.getSource() == yButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "Y");
        }
        else if (e.getSource() == uButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "U");
        }
        else if (e.getSource() == iButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "I");
        }
        else if (e.getSource() == oButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "O");
        }
        else if (e.getSource() == pButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "P");
        }
        else if (e.getSource() == aButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "A");
        }
        else if (e.getSource() == sButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "S");
        }
        else if (e.getSource() == dButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "D");
        }
        else if (e.getSource() == fButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "F");
        }
        else if (e.getSource() == gButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "G");
        }
        else if (e.getSource() == hButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "H");
        }
        else if (e.getSource() == jButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "J");
        }
        else if (e.getSource() == kButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "K");
        }
        else if (e.getSource() == lButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "L");
        }
        else if (e.getSource() == zButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "Z");
        }
        else if (e.getSource() == xButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "X");
        }
        else if (e.getSource() == cButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "C");
        }
        else if (e.getSource() == vButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "V");
        }
        else if (e.getSource() == bButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "B");
        }
        else if (e.getSource() == nButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "N");
        }
        else if (e.getSource() == mButton && player1.getCurrentLetter() >= 0 && player1.getCurrentLetter() < 5) {
            player1.increaseCurrentLetter();
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "M");
        }
        else if (e.getSource() == enterButton && player1.getCurrentLetter() == 5){
            player1.setAnswered(true);
        }
        else if (e.getSource() == delButton && player1.getCurrentLetter() > 0) {
            wordleGameBoard.addLetter(player1.getGuessNumber(), player1.getCurrentLetter(), "");
            player1.decreaseCurrentLetter();
        }
    }
}
