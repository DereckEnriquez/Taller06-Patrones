
package pruebapatrondediseño;

public class BasicCard implements CreditCard{
    @Override
    public void setProperties() {
        throw new UnsupportedOperationException("Realiza funciones de una tarjeta de credito"); //To change body of generated methods, choose Tools | Templates.
    }  
}
/*public*/class CreatorBasicCard extends Creator{
        @Override
        public CreditCard CreateCreditCard(){
            return new BasicCard();
        }
}
