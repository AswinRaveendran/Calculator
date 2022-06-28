import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	
	JFrame Frame;
	JLabel DisplayLabel;
	JButton SevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton DotButton;
	JButton ZeroButton;
	JButton EqualButton;
	JButton DivButton;
	JButton MultButton;
	JButton PlusButton;
	JButton MinusButton;
	JButton ClearButton;
	JButton SqureButton;
	JButton SqureRootButton;
	JButton BackSpaceButton;
	boolean IsOperatorClicked=false;
	String OldValue;
	String NewValue;
	Float Result;
	int Action;
	public Calculator (){
		Frame=new JFrame("Calculator");
		Frame.setLayout(null);
		Frame.setSize(600, 600);
		Frame.setLocation(300, 150);
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setBounds(30, 50, 540, 40);
		DisplayLabel.setForeground(Color.white);
		Frame.add(DisplayLabel);
		
		
		SevenButton=new JButton("7");
		SevenButton.setBounds(30, 130, 80, 80);
		SevenButton.setFont(new Font("Arial",Font.PLAIN , 60));
		SevenButton.addActionListener(this);
		Frame.add(SevenButton);
		
		
		EightButton=new JButton("8");
		EightButton.setBounds(130, 130, 80, 80);
		EightButton.setFont(new Font("Arial",Font.PLAIN , 60));
		EightButton.addActionListener(this);
		Frame.add(EightButton);
		
		NineButton=new JButton("9");
		NineButton.setBounds(230, 130, 80, 80);
		NineButton.setFont(new Font("Arial",Font.PLAIN , 60));
		NineButton.addActionListener(this);
		Frame.add(NineButton);
		
		FourButton=new JButton("4");
		FourButton.setBounds(30, 230, 80, 80);
		FourButton.setFont(new Font("Arial",Font.PLAIN , 60));
		FourButton.addActionListener(this);
		Frame.add(FourButton);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(130, 230, 80, 80);
		FiveButton.setFont(new Font("Arial",Font.PLAIN , 60));
		FiveButton.addActionListener(this);
		Frame.add(FiveButton);
		
		SixButton=new JButton("6");
		SixButton.setBounds(230, 230, 80, 80);
		SixButton.setFont(new Font("Arial",Font.PLAIN , 60));
		SixButton.addActionListener(this);
		Frame.add(SixButton);
		
		OneButton=new JButton("1");
		OneButton.setBounds(30, 330, 80, 80);
		OneButton.setFont(new Font("Arial",Font.PLAIN , 60));
		OneButton.addActionListener(this);
		Frame.add(OneButton);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(130, 330, 80, 80);
		TwoButton.setFont(new Font("Arial",Font.PLAIN , 60));
		TwoButton.addActionListener(this);
		Frame.add(TwoButton);
		
		ThreeButton=new JButton("3");
		ThreeButton.setBounds(230, 330, 80, 80);
		ThreeButton.setFont(new Font("Arial",Font.PLAIN , 60));
		ThreeButton.addActionListener(this);
		Frame.add(ThreeButton);
		
		DotButton=new JButton(".");
		DotButton.setBounds(30, 430, 80, 80);
		DotButton.setFont(new Font("Arial",Font.PLAIN , 60));
		DotButton.addActionListener(this);
		Frame.add(DotButton);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(130, 430, 80, 80);
		ZeroButton.setFont(new Font("Arial",Font.PLAIN , 60));
		ZeroButton.addActionListener(this);
		Frame.add(ZeroButton);
		
		EqualButton=new JButton("=");
		EqualButton.setBounds(230, 430, 80, 80);
		EqualButton.setFont(new Font("Arial",Font.PLAIN , 60));
		EqualButton.addActionListener(this);
		Frame.add(EqualButton);
		
		DivButton=new JButton("/");
		DivButton.setBounds(330, 130, 80, 80);
		DivButton.setFont(new Font("Arial",Font.PLAIN , 60));
		DivButton.addActionListener(this);
		Frame.add(DivButton);
		
		
		MultButton=new JButton("x");
		MultButton.setBounds(330, 230, 80, 80);
		MultButton.setFont(new Font("Arial",Font.PLAIN , 60));
		MultButton.addActionListener(this);
		Frame.add(MultButton);
		
		PlusButton=new JButton("+");
		PlusButton.setBounds(330, 330, 80, 80);
		PlusButton.setFont(new Font("Arial",Font.PLAIN , 60));
		PlusButton.addActionListener(this);
		Frame.add(PlusButton);
		
		MinusButton=new JButton("-");
		MinusButton.setBounds(330, 430, 80, 80);
		MinusButton.setFont(new Font("Arial",Font.PLAIN , 60));
		MinusButton.addActionListener(this);
		Frame.add(MinusButton);
		
		
		ClearButton=new JButton("Clear");
		ClearButton.setBounds(430, 430, 80, 80);
		ClearButton.setFont(new Font("Arial",Font.PLAIN , 18));
		ClearButton.addActionListener(this);
		Frame.add(ClearButton);
		
		
		SqureButton=new JButton("Square");
		SqureButton.setBounds(430, 330, 80, 80);
		SqureButton.setFont(new Font("Arial",Font.BOLD , 12));
		SqureButton.addActionListener(this);
		Frame.add(SqureButton);
		
		SqureRootButton=new JButton("Sqrt");
		SqureRootButton.setBounds(430, 230, 80, 80);
		SqureRootButton.setFont(new Font("Arial",Font.PLAIN , 20));
		SqureRootButton.addActionListener(this);
		Frame.add(SqureRootButton);
		
		BackSpaceButton=new JButton("Delete");
		BackSpaceButton.setBounds(430, 130, 80, 80);
		BackSpaceButton.setFont(new Font("Arial",Font.PLAIN , 16));
		BackSpaceButton.addActionListener(this);
		Frame.add(BackSpaceButton);
	}

	public static void main(String[] args) {
		new Calculator();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==SevenButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("7");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
		}else if(e.getSource()==EightButton) {
			
				if(IsOperatorClicked) {
					DisplayLabel.setText("8");
					IsOperatorClicked=false;
				}else {
			DisplayLabel.setText(DisplayLabel.getText()+"8");
				}
		}else if(e.getSource()==NineButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("9");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
		}else if(e.getSource()==FourButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("4");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"4");
			}
		}else if(e.getSource()==FiveButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("5");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"5");
			}
		}else if(e.getSource()==SixButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("6");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"6");
			}
		}else if(e.getSource()==OneButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("1");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"1");
			}
		}else if(e.getSource()==TwoButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("2");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"2");
			}
		}else if(e.getSource()==ThreeButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("3");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"3");
			}
		}else if(e.getSource()==DotButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText(".");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+".");
			}
		}else if(e.getSource()==ZeroButton) {
			if(IsOperatorClicked) {
				DisplayLabel.setText("0");
				IsOperatorClicked=false;
			}else {
		DisplayLabel.setText(DisplayLabel.getText()+"0");
			}
		}else if(e.getSource()==EqualButton) {
			NewValue=DisplayLabel.getText();
			  Float OldValueF=Float.parseFloat(OldValue);
		      Float NewValueF=Float.parseFloat(NewValue);
			  if(Action==3) {
				  Result=OldValueF+NewValueF;
			  }else if(Action==4) {
				  Result=OldValueF-NewValueF;
			  }else if(Action==2) {
				  Result=OldValueF*NewValueF;
			  }else if(Action==1) {
				  Result=OldValueF/NewValueF;
			  }
			DisplayLabel.setText(Result +"");
		
		
		}else if(e.getSource()==DivButton) {
			IsOperatorClicked=true;
			Action=1;
			OldValue=DisplayLabel.getText();
		}else if(e.getSource()==MultButton) {
			IsOperatorClicked=true;
			Action=2;
			OldValue=DisplayLabel.getText();
		}else if(e.getSource()==PlusButton) {
		  IsOperatorClicked=true;
		  Action=3;
		  OldValue=DisplayLabel.getText();
		}else if(e.getSource()==MinusButton) {
			IsOperatorClicked=true;
			Action=4;
			OldValue=DisplayLabel.getText();
		}else if(e.getSource()==ClearButton) {
			DisplayLabel.setText("");
		}else if(e.getSource()==SqureButton) {
			IsOperatorClicked=true;
			OldValue=DisplayLabel.getText();
			Float OldValueF=Float.parseFloat(OldValue);
			Result=OldValueF*OldValueF;
			DisplayLabel.setText(""+Result);
			
		    
	 }else if(e.getSource()==SqureRootButton) {
		        OldValue=DisplayLabel.getText();
			  Float OldValueF=Float.parseFloat(OldValue);
				double Result = Math.sqrt(OldValueF);
				DisplayLabel.setText(""+Result);
	}else if(e.getSource()==BackSpaceButton) {
		DisplayLabel.setText(DisplayLabel.getText().substring(0, DisplayLabel.getText().length() - 1));
	}
		
	}
	
}
// Code By Aswin.