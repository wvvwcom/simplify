package org.cf.smalivm;

import java.util.logging.Logger;

import org.cf.simplify.Main;

import gnu.trove.map.TIntObjectMap;

public class TestConstantPropigator {

    private static final String CLASS_NAME = "Lconstant_propigator_test;";

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getLogger(Main.class.getSimpleName());

    public void TestArrayGet() {
        TIntObjectMap<Object> initial = VMTester.buildRegisterState(0, new int[] { 0x42 }, 1, 0);
        TIntObjectMap<Object> expected = VMTester.buildRegisterState(0, 0x42);

        VMTester.testState(CLASS_NAME, "TestArrayGet()V", initial, expected);
    }

}