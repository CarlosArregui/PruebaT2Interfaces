package com.example.pruebat2innterfaces2;

import android.test.ActivityInstrumentationTestCase2;
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.typeText;
//import static android.support.test.espresso.matcher.ViewMatchers.withId;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

import static android.support.test.InstrumentationRegistry.getInstrumentation;


/**
 * @author ernesto
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<LogIn> {

    private Button mloginbutton;
    private EditText etext1;
    private EditText etext2;

    public ExampleInstrumentedTest() {
        super(LogIn.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        LogIn actividad = getActivity();

        mloginbutton = actividad.findViewById(R.id.btn_login);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }



    public void testLoginSignup() {
//        onView(withId(R.id.email)).perform(typeText(USERNAME));
//        onView(withId(R.id.password)).perform(typeText(PASSWORD));

        // first tap on value1 entry
        // now on login button
        TouchUtils.tapView(this, mloginbutton);

    }
}

