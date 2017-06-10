// Mileage.java

public class Mileage
{
  private int milesDriven;
  private int gallonsUsed;

  public Mileage( int miles, int gallons )
  {
    setMilesDriven( miles );
    setGallonsUsed( gallons );
  }

  public void setMilesDriven( int miles )
  {
    milesDriven = miles;
  }

  public void setGallonsUsed( int gallons )
  {
    gallonsUsed = gallons;
  }

  public int getMilesDriven()
  {
    return milesDriven;
  }

  public int getGallonsUsed ()
  {
    return gallonsUsed;
  }

  public float milesPerGallon()
  {
    return getMilesDriven()/getGallonsUsed();
  }

}
