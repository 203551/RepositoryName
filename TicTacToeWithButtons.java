import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeWithButtons extends JFrame implements ActionListener
{
   private JButton button00;                    // button in x 0, y 0
   private JButton button10;                    // button in x 1, y 0
   private JButton button20;                    // button in x 2, y 0
   private JButton button01;                    // button in x 0, y 1
   private JButton button11;                    // button in x 1, y 1
   private JButton button21;                    // button in x 2, y 1
   private JButton button02;                    // button in x 0, y 2
   private JButton button12;                    // button in x 1, y 2
   private JButton button22;                    // button in x 2, y 2

   private GridBagLayout layout;                // layout of the frame
   private GridBagConstraints constraints;      // helper for the layout

   private String playerTurn;                   // keeps track of which player's turn is next, X or O
   private int gameStatus = 0;                  // status of game: 0 not over yet, 1 X won, 2 O won, 3 draw
   private int noSkip = 1;                      // cheacks if the player completed an action or not
   private int turn = 0;                        // counts how amny turns have passed
  
   public TicTacToeWithButtons()                           
   {
      layout = new GridBagLayout();             // set up tic tac toe board
      setLayout(layout);
      constraints = new GridBagConstraints();  

      button00 = new JButton("");            // button in x 0, y 0
      button10 = new JButton("");            // button in x 1, y 0
      button20 = new JButton("");            // button in x 2, y 0
      button01 = new JButton("");            // button in x 0, y 1
      button11 = new JButton("");            // button in x 1, y 1
      button21 = new JButton("");            // button in x 2, y 1
      button02 = new JButton("");            // button in x 0, y 2
      button12 = new JButton("");            // button in x 1, y 2
      button22 = new JButton("");            // button in x 2, y 2
     
      constraints.fill = GridBagConstraints.BOTH;
      constraints.weightx = 1000;
      constraints.weighty = 1000;

      constraints.gridx = 0;                     // define constraints for button in x 0, y 0
      constraints.gridy = 0;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      layout.setConstraints(button00, constraints);
      add(button00); 

      constraints.gridx = 1;                     // define constraints for button in x 1, y 0
      constraints.gridy = 0;
      constraints.gridwidth = 1;
      constraints.gridheight = 1;
      layout.setConstraints(button10, constraints);
      add(button10);                             // add button to the layout

      constraints.gridx = 2;                     // define constraints for button in x 2, y 0
      constraints.gridy = 0;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button20, constraints);
      add(button20);                             // add button to the layout

      constraints.gridx = 0;                     // define constraints for button in x 0, y 1
      constraints.gridy = 1;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button01, constraints);
      add(button01);                             // add button to the layout

      constraints.gridx = 1;                     // define constraints for button in x 1, y 1
      constraints.gridy = 1;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button11, constraints);
      add(button11);                             // add button to the layout

      constraints.gridx = 2;                     // define constraints for button in x 2, y 1
      constraints.gridy = 1;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button21, constraints);
      add(button21);                             // add button to the layout
       
      constraints.gridx = 0;                     // define constraints for button in x 0, y 2
      constraints.gridy = 2;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button02, constraints);
      add(button02);                             // add button to the layout
       
      constraints.gridx = 1;                     // define constraints for button in x 1, y 2
      constraints.gridy = 2;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button12, constraints);
      add(button12);                             // add button to the layout
     
      constraints.gridx = 2;                     // define constraints for button in x 2, y 2
      constraints.gridy = 2;
      constraints.gridwidth = 1;
      constraints.gridheight = 1; 
      layout.setConstraints(button22, constraints);
      add(button22);                             // add button to the layout
       
      button00.addActionListener(this);          // listen to button clicks
      button10.addActionListener(this);
      button20.addActionListener(this);
      button01.addActionListener(this);
      button11.addActionListener(this);
      button21.addActionListener(this);
      button02.addActionListener(this);
      button12.addActionListener(this);
      button22.addActionListener(this);
     
      playerTurn = "X";                            // X makes first move
   }

   public void actionPerformed(ActionEvent e)       
   {
   
      noSkip = 1;  
      if (e.getSource() == button00)
      {
         if (button00.getText().equals(""))
         {
            button00.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      else if (e.getSource() == button10)
      {
         if (button10.getText().equals(""))
         {
            button10.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      else if (e.getSource() == button20)
      {
         if (button20.getText().equals(""))
         {
            button20.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      
      else if (e.getSource() == button01)
      {
         if (button01.getText().equals(""))
         {
            button01.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      else if (e.getSource() == button11)
      {
         if (button11.getText().equals(""))
         {
            button11.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      else if (e.getSource() == button21)
      {
         if (button21.getText().equals(""))
         {
            button21.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      
      else if (e.getSource() == button02)
      {
         if (button02.getText().equals(""))
         {
            button02.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      else if (e.getSource() == button12)
      {
         if (button12.getText().equals(""))
         {
            button12.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }
      else if (e.getSource() == button22)
      {
         if (button22.getText().equals(""))
         {
            button22.setText(playerTurn);
            noSkip = 0;
         }
         else
         {
            repaint();
         }
      }

      // win detection for X
      if (button00.getText().equals("X") && button10.getText().equals("X") && button20.getText().equals("X"))
      {
         gameStatus = 1;               // X won in top row
      }
      else if (button01.getText().equals("X") && button11.getText().equals("X") && button21.getText().equals("X"))
      {
         gameStatus = 1;               // X won in middle row
      }
      else if (button02.getText().equals("X") && button12.getText().equals("X") && button22.getText().equals("X"))
      {
         gameStatus = 1;               // X won in bottom row
      }
      else if (button00.getText().equals("X") && button01.getText().equals("X") && button02.getText().equals("X"))
      {
         gameStatus = 1;               // X won in left column
      }
      else if (button10.getText().equals("X") && button11.getText().equals("X") && button12.getText().equals("X"))
      {
         gameStatus = 1;               // X won in middle column
      }
      else if (button20.getText().equals("X") && button21.getText().equals("X") && button22.getText().equals("X"))
      {
         gameStatus = 1;               // X won in right column
      }
      else if (button00.getText().equals("X") && button11.getText().equals("X") && button22.getText().equals("X"))
      {
         gameStatus = 1;               // X won in left to right cross
      }
      else if (button20.getText().equals("X") && button11.getText().equals("X") && button02.getText().equals("X"))
      {
         gameStatus = 1;               // X won in right to left cross
      }
      
      // win detection for O
      else if (button00.getText().equals("O") && button10.getText().equals("O") && button20.getText().equals("O"))
      {
         gameStatus = 2;               // O won in top row
      }
      else if (button01.getText().equals("O") && button11.getText().equals("O") && button21.getText().equals("O"))
      {
         gameStatus = 2;               // O won in middle row
      }
      else if (button02.getText().equals("O") && button12.getText().equals("O") && button22.getText().equals("O"))
      {
         gameStatus = 2;               // O won in bottom row
      }
      else if (button00.getText().equals("O") && button01.getText().equals("O") && button02.getText().equals("O"))
      {
         gameStatus = 2;               // O won in left column
      }
      else if (button10.getText().equals("O") && button11.getText().equals("O") && button12.getText().equals("O"))
      {
         gameStatus = 2;               // O won in middle column
      }
      else if (button20.getText().equals("O") && button21.getText().equals("O") && button22.getText().equals("O"))
      {
         gameStatus = 2;               // O won in right column
      }
      else if (button00.getText().equals("O") && button11.getText().equals("O") && button22.getText().equals("O"))
      {
         gameStatus = 2;               // O won in left to right cross
      }
      else if (button20.getText().equals("O") && button11.getText().equals("O") && button02.getText().equals("O"))
      {
         gameStatus = 2;               // O won in right to left cross
      }
      
      // tie detection
      else if (turn == 8 && gameStatus == 0)
      {
         gameStatus = 3;               // tie
      }
     
      // announce winner
      if (gameStatus > 0)
      {
        
         if (gameStatus == 1)               // X won
         {
            // hide the buttons and display that X won
            button11.setText("X won the game");             // temporary                  
         }
         
         else if (gameStatus == 2)          // O won
         {
            // hide the buttons and display that O won
            button11.setText("O won the game");             // temporary                  
         }
         else                               // Tie
         {
            // hide the buttons and display that no one won
            button11.setText("No one won, it's a tie.");    // temporary                  
         }
      }
            
      // toggling player turn
      if (gameStatus == 0 && noSkip == 0)
      {
         if (playerTurn.equals("X"))
         {
            playerTurn = "O";
            turn += 1;
         }
         else
         {
            playerTurn = "X";
            turn += 1;
         } 
      }
      else
      {
         playerTurn = playerTurn;
      }

      repaint();
   }// end of actionPerformed

   
   public static void main(String[] args)
   {
      TicTacToeWithButtons prog = new TicTacToeWithButtons();
      prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prog.setSize(500, 400);
      prog.setVisible(true);
   }
     
}// end of class



