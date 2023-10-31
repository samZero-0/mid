
package midpractice1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class MidExamSceneController implements Initializable {

    @FXML
    private TextField elementTextField;
    @FXML
    private TextArea showResultTextArea;
    @FXML
    private RadioButton forwardRadioButton;
    @FXML
    private ToggleGroup traverse;
    @FXML
    private RadioButton backwordRadiobutton;
    @FXML
    private ComboBox<String> oddEvenCombo;
    @FXML
    private RadioButton arr1RB;
    @FXML
    private ToggleGroup myArrInstance;
    @FXML
    private RadioButton arr2RB;
    @FXML
    private RadioButton arr3RB;
    @FXML
    private TextArea traverseResultTextArea;
    private ArrayList<Integer> valList;
    private MyArray arr1,arr2,arr3;
    private MyArray x;
    private MyArray y;
    private ArrayList<MyArray> a1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        oddEvenCombo.getItems().addAll("Even","Odd");
        valList = new ArrayList();
        arr1=new MyArray();
        MyArray x =new MyArray();
        MyArray y =new MyArray();
        //arr2 = new MyArray();
        //arr3 = new MyArray();
    }    

    @FXML
    private void addElementsToValListOnClick(ActionEvent event) {
        valList.add(Integer.parseInt(elementTextField.getText()));
        
    }

    @FXML
    private void createArr1instanceOnClick(ActionEvent event) {
        arr1 = new MyArray(valList);
        showResultTextArea.appendText(arr1.toString()+'\n');
        a1 = new MyArray();
        a1.add(arr1);
        //valList.clear();
        //MyArray x =arr1;
        valList.clear();
    }

    @FXML
    private void createArr2instanceOnClick(ActionEvent event) {
        arr2 = new MyArray(valList);
        showResultTextArea.appendText(arr2.toString());
        //MyArray y = arr2;
       // valList.clear();
    }

    @FXML
    private void mergeArrayOnClick(ActionEvent event) {
        //arr3 = new MyArray();
        //arr3.merge(arr1,arr2);
        showResultTextArea.appendText(MyArray.merge(arr1, arr2));
    }

    @FXML
    private void traverseAndShowResultOnClick(ActionEvent event) {
    }
    
}
