package pedroPathing.States;

import static pedroPathing.newOld.PositionStorage.*;
// Define Outtake States
public class OuttakeSpecimenHang implements State {
    @Override
    public void execute() {
        //System.out.println("Executing OuttakeStateSpecimen...");
        // Set servo and motor positions for this state
        stateStringOutake = "OuttakeSpecimenHang";
        isOuttakeStateSpecimen = true;
        wasOuttakeStateSpecimen= true;
        wasisOuttakeStateSpecimen = true;
        if(outakeSampleServoPosition != servoextended)
            outakeSampleServoPosition=outakeSampleRetracted;
        outakeArmServoPosition = outtakeArmSpecimenPut;
        outakeTargetPos = -1850;
    }
}
