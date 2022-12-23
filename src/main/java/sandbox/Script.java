package sandbox;

import script.SCRIPT;

public class Script implements SCRIPT {

    @Override
    public CharSequence name() {
        return "SoS Sandbox";
    }

    @Override
    public CharSequence desc() {
        return "Songs of Syx sandbox script.";
    }

    @Override
    public void initBeforeGameCreated() {

    }

    @Override
    public SCRIPT_INSTANCE initAfterGameCreated() {
        return new Instance();
    }
}
