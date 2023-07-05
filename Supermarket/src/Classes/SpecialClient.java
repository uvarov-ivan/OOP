package Classes;

public class SpecialClient extends Actor {
  private int idVip;

  /**
   * Класс описывающий VIP клиентов
   * 
   * @param name     Имя клиента
   * @param pensID   ID VIP клиента
   * @param isReturn флаг возврата товара
   */
  public SpecialClient(String name, Integer id, boolean isReturn) {
    super(name);
    super.isReturn = isReturn;
    this.idVip = id;
    super.status = 0; // Статус клиенто (0 - VIP)
  }

  public SpecialClient(String name, Integer id) {
    super(name);
    super.isReturn = false;
    this.idVip = id;
    super.status = 0;
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

  // @Override
  // public String getName() {
  // return name;
  // }

  // public int getIdVip() {
  // return idVip;
  // }
}
