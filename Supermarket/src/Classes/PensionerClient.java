package Classes;

public class PensionerClient extends Actor {
  private int pensID;

  /**
   * Класс описывающий клиентов-пенсионеров
   * 
   * @param name   Имя клиента
   * @param pensID ID клиента-пенсионера
   * @param isReturn флаг возврата товара
   */
  public PensionerClient(String name, int pensID, boolean isReturn) {
    super(name + " - пенсионер");
    this.pensID = pensID;
    super.isReturn = isReturn;
    super.status = 1; // Статус клиенто (1 - пенсионет)
  }

    public PensionerClient(String name, int pensID) {
    super(name + " - пенсионер");
    this.pensID = pensID;
    super.isReturn = false;
    super.status = 1;
  }

  @Override
  public String getName() {
    return super.name;
  }

  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  
  public boolean isReturn() {
    return this.isReturn;
  }

  public void setMakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
  }

  public void setTakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
  }

  public Actor getActor() {
    return this;
  }

  public int getStatus() {
    return this.status;
  }

}
