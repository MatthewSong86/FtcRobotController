package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name = "Kai", group = "LinearOpMode")
public class Tutorial extends LinearOpMode {
    public DcMotor motor1;
    public CRServo servo1;
    public void runOpMode() throws InterruptedException {
        DcMotor motor1 = hardwareMap.get(DcMotor.class, "motor1");
        CRServo servo1 = hardwareMap.get(CRServo.class, "servo1");
        telemetry.addData("Status", "Initalized");
        telemetry.update();
        waitForStart();

        while(opModeIsActive()){
            motor1.setPower(gamepad1.right_stick_y);
            if(gamepad1.left_stick_y<0) servo1.setPower(0);
            else if(gamepad1.left_stick_y>0) servo1.setPower(1);
            else servo1.setPower(0.5);


        }
    }
}
