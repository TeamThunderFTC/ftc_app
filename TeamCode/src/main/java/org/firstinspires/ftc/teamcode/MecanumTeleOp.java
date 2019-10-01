package org.firstinspires.ftc.teamcode;

import android.graphics.Path;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name ="MecanumTeleOp", group="Robot")
//@Disabled
public class MecanumTeleOp extends LinearOpMode {

    HardwareRobot robot = new HardwareRobot();
    ElapsedTime runtime = new ElapsedTime();
    public DcMotor leftFrontDrive = null;
    public DcMotor rightFrontDrive = null;
    public DcMotor leftBackDrive = null;
    public DcMotor rightBackDrive = null;

    @Override
    public void runOpMode() {

        leftFrontDrive = hardwareMap.get(DcMotor.class, "leftFrontDrive");
        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);

        rightFrontDrive = hardwareMap.get(DcMotor.class, "rightFrontDrive");
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);

        leftBackDrive = hardwareMap.get(DcMotor.class, "leftBackDrive");
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setDirection(DcMotor.Direction.FORWARD);

        rightBackDrive = hardwareMap.get(DcMotor.class, "rightBackDrive");
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE);

        double speedAdjust = 7;

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {

        }
    }
}