package Classes;

public class OrdinaryClient extends Actor {

  /**
   * Класс описывающий обычных клиентов
   * 
   * @param name     Имя клиента
   * @param isReturn флаг возврата товара
   */
  public OrdinaryClient(String name, boolean isReturn) {
    super(name);
    super.isReturn = isReturn;
    super.status = 3; // Статус клиенто (3 - обычный)
  }

  public OrdinaryClient(String name) {
    super(name);
    super.isReturn = false;
    super.status = 3;
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

  public boolean isReturn() {
    return this.isReturn;
  }

  // public boolean isSetTakeOrder() {
  // return setTakeOrder;
  // }

  // public void setSetTakeOrder(boolean setTakeOrder) {
  // this.setTakeOrder = setTakeOrder;
  // }

  // public boolean isSetMakeOrder() {
  // return setMakeOrder;
  // }

  // public void setSetMakeOrder(boolean setMakeOrder) {
  // this.setMakeOrder = setMakeOrder;
  // }

  // @Override
  // public String getName() {
  // return name;
  // }
}
