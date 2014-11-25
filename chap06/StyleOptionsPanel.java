package chap06;

//************************************************************
//StyleOptionsPanel.java Author: Lewis/Loftus
//
//Demonstrates the use of check boxes.
//************************************************************
import javax. swing. *;
import java.awt.*;
import java.awt.event.*;
public class StyleOptionsPanel extends JPanel
{
private int fontSize = 36;
private int style = Font.PLAIN;
private JLabel saying;
private JCheckBox bold, italic;
private JRadioButton small, medium, large;
//--------------------------------------------------------------
//Sets up a panel with a label and some check boxes that
//control the style of the label's font.
//--------------------------------------------------------------
public StyleOptionsPanel()
{
saying = new JLabel ("Say it with style!");
saying.setFont (new Font ("Helvetica", style, fontSize));
bold = new JCheckBox ("Bold");
bold.setBackground (Color.cyan);
italic = new JCheckBox ("Italic");
italic.setBackground (Color.cyan);
small = new JRadioButton("Small Font");
small.setBackground(Color.cyan);
medium = new JRadioButton("Medium Font");
medium.setBackground(Color.cyan);
large = new JRadioButton("Large Font");
large.setBackground(Color.cyan);
large.setSelected(true);

ButtonGroup group = new ButtonGroup();
group.add(small);
group.add(medium);
group.add(large);

StyleListener listener = new StyleListener ();
bold.addItemListener (listener);
italic.addItemListener (listener) ;
small.addItemListener (listener);
medium.addItemListener (listener);
large.addItemListener (listener);
add (saying);
add (bold);
add (italic);
add (small);
add (medium);
add (large);
setBackground (Color.cyan);
setPreferredSize (new Dimension(300, 100));
}
//************************************************************
//Represents the listener for both check boxes.
//************************************************************
private class StyleListener implements ItemListener
{
//-----------------------------------------------------
//Updates the style of the label font style.
//-----------------------------------------------------
public void itemStateChanged (ItemEvent event) {
style = Font.PLAIN;
if (bold.isSelected())
style = Font.BOLD;
if (italic.isSelected())
style += Font.ITALIC;
if (small.isSelected())
    fontSize = 12;
if (medium.isSelected())
    fontSize = 24;
if (large.isSelected())
    fontSize = 36;
saying.setFont (new Font ("Helvetica", style, fontSize));
    
}
}
}
