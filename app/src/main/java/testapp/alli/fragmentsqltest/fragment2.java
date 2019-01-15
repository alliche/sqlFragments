package testapp.alli.fragmentsqltest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class fragment2 extends Fragment {

    private static final String TAG = "Fragment2";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavSecondActivity;


    /** Specific to fragments, instead of onCreate method */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container, false);

        /** When in a fragment, you have to refrence the view when finding buttons, etc. */
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFragment1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFragment2);
        btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);

        btnNavFrag1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to frag 1", Toast.LENGTH_SHORT).show();
                // navigate to fragment
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });


        btnNavFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to frag 2", Toast.LENGTH_SHORT).show();
                // navigate to fragment
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavSecondActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Going to SecondActivity", Toast.LENGTH_SHORT).show();
                // navigate to fragment

                Intent intent = new Intent(getActivity(),SecondActivity.class);
                startActivity(intent);
            }
        });

        /** Must return a view at the end of this method */
        return view;

    }

}
