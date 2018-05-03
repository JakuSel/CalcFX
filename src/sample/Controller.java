package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {


    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button zero;
    public Button dot;
    public Button eq;
    public Button add;
    public Button sub;
    public Button mul;
    public Button div;
    public TextField display;
    public Button CE;
    Float data = 0f;
    int operation = -1;


    public void handleButton(ActionEvent event){
        if(event.getSource() == one){
            display.setText(display.getText() + "1");
        }

        else if(event.getSource() == two){
            display.setText(display.getText() + "2");
        }

        else if(event.getSource() == three){
            display.setText(display.getText() + "3");
        }

        else if(event.getSource() == four){
            display.setText(display.getText() + "4");
        }

        else if(event.getSource() == five){
            display.setText(display.getText() + "5");
        }

        else if(event.getSource() == six){
            display.setText(display.getText() + "6");
        }

        else if(event.getSource() == seven){
            display.setText(display.getText() + "7");
        }

        else if(event.getSource() == eight){
            display.setText(display.getText() + "8");
        }

        else if(event.getSource() == nine){
            display.setText(display.getText() + "9");
        }

        else if(event.getSource() == zero){
            display.setText(display.getText() + "0");
        }

        else if(event.getSource() == CE){
            display.setText(" ");
        }

        else if(event.getSource() == div){
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        }

        else if(event.getSource() == mul){
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        }

        else if(event.getSource() == sub){
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        }

        else if(event.getSource() == add){
            data = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
        }

        else if(event.getSource() == eq){

            Float secondOperand = Float.parseFloat(display.getText());

            switch(operation){
                case 1:Float ans = data+secondOperand;
                    display.setText(String.valueOf(ans));break;

                case 2: ans = data-secondOperand;
                    display.setText(String.valueOf(ans));break;

                case 3: ans = data*secondOperand;
                    display.setText(String.valueOf(ans));break;

                case 4:
                    ans = 0f;
                    try {
                        ans = data/secondOperand;
                    }catch (Exception e){
                        display.setText("Err");
                    }
                    display.setText(String.valueOf(ans));break;


            }

        }

    }
}

