package com.brillica_services.coffee_shop;

        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;


public class SampleCoffee extends AppCompatActivity {
    EditText name;
    EditText qty;
    RadioButton cap250;
    RadioButton cap500;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_coffee);
        submit=findViewById(R.id.submit);
        name=(EditText)findViewById(R.id.name);
        qty=(EditText) findViewById(R.id.quantity);
        cap250=(RadioButton) findViewById(R.id.cap250);
        cap500=(RadioButton) findViewById(R.id.cap500);
        result=(TextView)findViewById(R.id.result);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int totalprice=0;
                String cname=String.valueOf(name.getText());
                int cquantity=Integer.parseInt(String.valueOf(qty.getText()));

                if(cap250.isChecked()){
                    totalprice=10*cquantity;
                    Toast.makeText(getApplicationContext(),cname+" your bill is: "+totalprice,Toast.LENGTH_LONG).show();
                }
                else if(cap500.isChecked()){
                    totalprice=15*cquantity;
                    Toast.makeText(getApplicationContext()," "+cname+" your bill is: "+totalprice,Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Capacity not selected",Toast.LENGTH_SHORT).show();
                }
                // System.out.print("Total price is: "+totalprice); This cannot be used
                //result.setText("Hello"+name+" your bill is: "); This can be used




            }
        });
    }
}
