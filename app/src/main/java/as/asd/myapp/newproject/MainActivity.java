package as.asd.myapp.newproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed;
    Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,multi,div,percent,ac,point,equal;
    float number1,number2 , result;
    String results="";
    String op=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=(EditText)findViewById(R.id.editText);
        zero=(Button)findViewById(R.id.zero);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        multi=(Button)findViewById(R.id.multi);
        div=(Button)findViewById(R.id.div);
        percent=(Button)findViewById(R.id.percent);
        ac=(Button)findViewById(R.id.AC);
        point=(Button)findViewById(R.id.point);
        equal=(Button)findViewById(R.id.equal) ;

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(op==null) {
                    results=results+"1";
                    number1 = Integer.parseInt(results);
                    ed.setText(results);



                }
                else
                {
                    results=results+"1";
                    number2 = Integer.parseInt(results);
                    ed.setText(results);

                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(op==null) {
                    results=results+"2";
                    number1 = Integer.parseInt(results);
                    ed.setText(results);

                }
                else
                {
                    results=results+"2";
                    number2=  Integer.parseInt(results);
                    ed.setText(results);

                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(op==null) {
                    results=results+"3";
                    number1 =  Integer.parseInt(results);
                    ed.setText(results);

                }
                else
                {
                    results=results+"3";
                    number2= Integer.parseInt(results);
                    ed.setText(results);

                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"4";
                    number1 =  Integer.parseInt(results);
                    ed.setText(results);

                }
                else
                {
                    results=results+"4";
                    number2= Integer.parseInt(results);
                    ed.setText(results);

                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"5";
                    number1 =  Integer.parseInt(results);
                    ed.setText(results);

                }
                else
                {
                    results=results+"5";
                    number2= Integer.parseInt(results);
                    ed.setText(results);

                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"6";
                    number1 =  Integer.parseInt(results);
                    ed.setText(results);

                }
                else
                {
                    results=results+"6";
                    number2= Integer.parseInt(results);
                    ed.setText(results);

                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"7";
                    number1 =  Integer.parseInt(results);
                    ed.setText(results);
                }
                else
                {
                    results=results+"7";
                    number2= Integer.parseInt(results);
                    ed.setText(results);
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"8";
                    number1 = Integer.parseInt(results);
                    ed.setText(results);
                }
                else
                {
                    results=results+"8";
                    number2= Integer.parseInt(results);
                    ed.setText(results);
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"9";
                    number1 = Integer.parseInt(results);
                    ed.setText(results);
                }
                else
                {
                    results=results+"9";
                    number2= Integer.parseInt(results);
                    ed.setText(results);
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op==null) {
                    results=results+"0";
                    number1 =  Integer.parseInt(results);
                    ed.setText(results);
                }
                else
                {

                    results=results+"0";
                    number2= Integer.parseInt(results);
                    ed.setText(results);
                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="+";
                results=results+"+";
                ed.setText(results);
                results = "";

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="-";
                results=results+"-";
                ed.setText(results);
                results="";

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="*";
                results=results+"*";
                ed.setText(results);
                results="";

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="/";
                results=results+"/";
                ed.setText(results);
                results="";
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="%";
                results=results+"%";
                ed.setText(results);
                results="";
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op=null;
                number1=0;
                number2=0;
                result=0;
                results="";
                ed.setText("");

            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (op){
                    case "+":
                        result=number1+number2;
                        ed.setText(String.valueOf(result));
                        break;
                    case "-":
                        result=number1-number2;
                        ed.setText(String.valueOf(result));
                        break;
                    case "/":
                        result=number1/number2;
                        ed.setText(String.valueOf(result));
                        break;
                    case "*":
                        result=number1*number2;
                        ed.setText(String.valueOf(result));
                        break;
                    case "%":
                        result=number1+number2;
                        ed.setText(String.valueOf(result));
                        break;
                }
                results="";
                number1=0;
                number2=0;
                op=null;

            }
        });




    }

}
