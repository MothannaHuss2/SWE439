public class Car
{
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;
    private boolean isParked;

    public Car(String make, String model, int year, String color)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
        this.isParked = true;
    }

    public void Start()
    {
        if (isParked)
        {
            isRunning = true;
            isParked = false;

        }
        else
        {
            System.out.println("The car is already running.");
        }
    }

    public void Stop()
    {
        if (isRunning)
        {
            isRunning = false;
            isParked = true;
        }
        else
        {
            System.out.println("The car is already stopped.");
        }
    }

    public void Accelerate(int speed)
    {
        if (isRunning && !isParked)
        {
            System.out.println("The car is accelerating to {speed} mph.");
        }
        else
        {
            System.out.println("You can't accelerate while the car is not running or parked.");
        }
    }

    public void Brake()
    {
        if (isRunning && !isParked)
        {
            System.out.println("The car is braking.");
        }
        else
        {
            System.out.println("You can't brake while the car is not running or parked.");
        }
    }

    public void Paint(String newColor)
    {
        color = newColor;
        System.out.println("The car has been painted {newColor}.");
    }

    public void TuneUp()
    {
        System.out.println("The car has had a tune-up.");
    }

    public void RepairEngine()
    {
        System.out.println("The engine has been repaired.");
    }

    public void ReplaceTires()
    {
        System.out.println("The tires have been replaced.");
    }

    public void ChangeOil()
    {
        System.out.println("The oil has been changed.");
    }

    public void ReplaceBattery()
    {
        System.out.println("The battery has been replaced.");
    }

    public void ReplaceTransmission()
    {
        System.out.println("The transmission has been replaced.");
    }

    public void ReplaceBrakes()
    {
        System.out.println("The brakes have been replaced.");
    }
}