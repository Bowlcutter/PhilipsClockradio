package dk.dtu.philipsclockradio;

import static dk.dtu.philipsclockradio.ContextClockradio.ui;

public class StateFM extends StateAdapter {



    StateFM(){}


    @Override
    public void onClick_Hour(ContextClockradio context) {


    }

    @Override
    public void onClick_Min(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Hour(ContextClockradio context) {

    }

    @Override
    public void onLongClick_Min(ContextClockradio context) {

    }

    @Override
    public void onClick_Power(ContextClockradio context) {

        context.setState(new StateAM());
    }

    @Override
    public void onExitState(ContextClockradio context) {
        ui.toggleRadioPlaying();
    }

    @Override
    public void onLongClick_Sleep(ContextClockradio context) {
        context.setState(new StateStandby(context.getTime()));
    }


}
