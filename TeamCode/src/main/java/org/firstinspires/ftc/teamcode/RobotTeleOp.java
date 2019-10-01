package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name ="RobotTeleOp", group="Robot")
//@Disabled
public class RobotTeleOp extends OpMode {

    HardwareRobot robot = new HardwareRobot();
    double speed;
    double direction;

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        speed = Math.hypot(gamepad1.right_stick_x, gamepad1.right_stick_y);
        direction = Math.atan2(gamepad1.right_stick_y, -gamepad1.right_stick_x) - Math.PI / 4;

        MecanumDrive(speed, direction, 90);
    }

    protected void MecanumDrive(double speed, double direction, double rotation) {
        final double v1 = speed * Math.cos(direction) + rotation;
        final double v2 = speed * Math.sin(direction) - rotation;
        final double v3 = speed * Math.sin(direction) + rotation;
        final double v4 = speed * Math.cos(direction) - rotation;

        robot.leftFrontDrive.setPower(v1);
        robot.rightFrontDrive.setPower(v2);
        robot.leftBackDrive.setPower(v3);
        robot.rightBackDrive.setPower(v4);
    }
}
