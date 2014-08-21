package au.com.wow.codetestapp;

import android.content.res.Resources;
import android.test.InstrumentationTestCase;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FuelStationListTest extends InstrumentationTestCase {
    JSONObject mJsonObject;

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        InputStream raw = getInstrumentation().getContext().getAssets().open("fuelstationlist.json");
        String json = new Scanner(raw).useDelimiter("\\A").next();
        mJsonObject = new JSONObject(json);
    }

    public void testJsonObjectIsNotNull() {
        assertTrue(mJsonObject != null);
    }

    public void testNumberOfStations() throws JSONException {
        assertEquals(mJsonObject.getJSONArray("item").length(), 50);
    }

    // add more test cases
}
