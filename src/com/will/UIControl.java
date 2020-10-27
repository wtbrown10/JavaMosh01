package com.will;

public class UIControl {
    private boolean isEnabled = true;

    public void enabled() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
