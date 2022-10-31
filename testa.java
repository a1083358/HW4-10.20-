import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame{
  public JPanel contentPane,contentPane_button;
  public String[] web={"thumbbig-1187119.jpg","73475147_106315744137400_5466457726638882816_o-750x422.jpg","1619624874-5dc68c6b7ae1bf413bb034e1e0d7ab0c.jpg"};
  int index=0;
  public MyJFrame(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Hello JFrame");
    setBounds(200,200,650,500);

    contentPane = new JPanel();
    add(contentPane);

    JLabel lab1 = new JLabel("picture");
    lab1.setHorizontalAlignment(JLabel.CENTER);//限制字在中間
    contentPane.add(lab1);
    
    //設定照片
    ImageIcon img1= new ImageIcon("thumbbig-1187119.jpg");
    JLabel lab2 = new JLabel();
    lab2.setIcon(img1);
    contentPane.add(lab2);

    JButton last = new JButton("last");
    last.setSize(100,100);//設定按鈕大小
    last.addActionListener(new ActionListener(){//監聽按鈕
      public void actionPerformed(ActionEvent e){
        index-=1;
        if(index<0){//如果找不到圖，顯示視窗提醒
          JOptionPane.showMessageDialog(null, "沒有圖片了", "確定", JOptionPane.INFORMATION_MESSAGE);
        }else{
          ImageIcon img= new ImageIcon(web[index]);
          lab2.setIcon(img);//直接改圖片
          //contentPane.add(lab2);
        }
      }
    });
    //contentPane_button.add(last);
    contentPane.add(last,BorderLayout.SOUTH);


    JButton after = new JButton("next");
    after.setSize(100,100);//設定按鈕大小
    after.addActionListener(new ActionListener(){//監聽按鈕
      public void actionPerformed(ActionEvent e){
        index+=1;
        if(index>2){//如果找不到圖，顯示視窗提醒
          JOptionPane.showMessageDialog(null, "沒有圖片了", "確定", JOptionPane.INFORMATION_MESSAGE);
        }else{
        ImageIcon img= new ImageIcon(web[index]);
        lab2.setIcon(img);
        }
      }
    });
    contentPane.add(after,BorderLayout.SOUTH);

    setVisible(true);
  }
}
class testa {
  public static void main(String[] args) {
    MyJFrame f=new MyJFrame();
  }
}