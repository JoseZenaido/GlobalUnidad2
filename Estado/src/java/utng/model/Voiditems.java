/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;

/**
 *
 * @author 
 */
public class Voiditems {
    private int id;
    private String idBillSale;
    private String idItem;
    private String price;
    private String quanity;
    private String discount;
    private String totalAmount;
    private String paymentAmount;
    private String remainAmount;
    
    
    public Voiditems(int id, String idBillSale, String idItem,String price,String  quanity,String  discount,
            String totalAmount, String paymentAmount, String remainAmount){
        this.id=id;
        this.idBillSale=idBillSale;
        this.idItem=idItem;
        this.price=price;
        this.quanity=quanity;
        this.discount=discount;
        this.totalAmount=totalAmount;
        this.paymentAmount=paymentAmount;
        this.remainAmount=remainAmount;
   
    }
    public Voiditems(){
        this(0,"","","","","","","","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdBillSale() {
        return idBillSale;
    }

    public void setIdBillSale(String idBillSale) {
        this.idBillSale = idBillSale;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuanity() {
        return quanity;
    }

    public void setQuanity(String quanity) {
        this.quanity = quanity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(String remainAmount) {
        this.remainAmount = remainAmount;
    }

    @Override
    public String toString() {
        return "Voiditems{" + "id=" + id + ", idBillSale=" + idBillSale + ", idItem=" + idItem + ", price=" + price + ", quanity=" + quanity + ", discount=" + discount + ", totalAmount=" + totalAmount + ", paymentAmount=" + paymentAmount + ", remainAmount=" + remainAmount + '}';
    }
    
    
}
