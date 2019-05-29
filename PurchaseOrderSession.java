package com.moglix.buyer.po.models.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * PurchaseOrderSession is an entity which maps data to the purchase order session collection in database.
 *
 * @author Kuldeep Dangi <kuldeep.dangi@moglix.com>
 */
@Document(collection = "purchase_order_session")
public class PurchaseOrderSession {

    @Id
    private String _id;
    private OrderValue orderValue;
    private Buyer buyer;
    private List<Items> items = new ArrayList<>();
    private Vendor vendor;
    private List<Attachment> attachments = new ArrayList<>();
    private String customerPoNum;
    private Integer createdBy;
    private String createdByName;
    private Integer customerVendorCode;
    private String idAddress;
    private SapDetail sapDetails;
    private Tax tax;
    private OtherCharge otherCharges;
    private Integer approvalStatus;
    private String remark;
    private PaymentTerms paymentTerms;




    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public PurchaseOrderSession.OrderValue getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(PurchaseOrderSession.OrderValue orderValue) {
        this.orderValue = orderValue;
    }

    public PurchaseOrderSession.Tax getTax() {
        return tax;
    }

    public void setTax(PurchaseOrderSession.Tax tax) {
        this.tax = tax;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public SapDetail getSapDetails() {
        return sapDetails;
    }

    public void setSapDetails(SapDetail sapDetails) {
        this.sapDetails = sapDetails;
    }

    public OtherCharge getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(OtherCharge otherCharges) {
        this.otherCharges = otherCharges;
    }

  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getCustomerPoNum() {
        return customerPoNum;
    }

    public void setCustomerPoNum(String customerPoNum) {
        this.customerPoNum = customerPoNum;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public Integer getCustomerVendorCode() {
        return customerVendorCode;
    }

    public void setCustomerVendorCode(Integer customerVendorCode) {
        this.customerVendorCode = customerVendorCode;
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getRemark() {
    return remark;
  }

    public void setRemark(String remark) {
    this.remark = remark;
  }

    public static class OrderValue {
        private Double amount;
        private String currency;

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

    }

    public static class Buyer {
        private String _id;
        private String gstn;
        private PurchaseOrderSession.Buyer.ShippingAddress shippingAddress;

        public PurchaseOrderSession.Buyer.ShippingAddress getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(PurchaseOrderSession.Buyer.ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getGstn() {
            return gstn;
        }

        public void setGstn(String gstn) {
            this.gstn = gstn;
        }

        public static class ShippingAddress {
            private String _id;
            private String name;
            private String gstn;
            private String addressLine1;
            private String addressLine2;
            private String city;
            private String state;
            private String country;
            private Integer pincode;
            private Integer phone;
            private String emailId;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGstn() {
                return gstn;
            }

            public void setGstn(String gstn) {
                this.gstn = gstn;
            }

            public String getAddressLine1() {
                return addressLine1;
            }

            public void setAddressLine1(String addressLine1) {
                this.addressLine1 = addressLine1;
            }

            public String getAddressLine2() {
                return addressLine2;
            }

            public void setAddressLine2(String addressLine2) {
                this.addressLine2 = addressLine2;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public Integer getPincode() {
                return pincode;
            }

            public void setPincode(Integer pincode) {
                this.pincode = pincode;
            }

            public Integer getPhone() {
                return phone;
            }

            public void setPhone(Integer phone) {
                this.phone = phone;
            }

            public String getEmailId() {
                return emailId;
            }

            public void setEmailId(String emailId) {
                this.emailId = emailId;
            }
        }
    }

    public static class Items {

        private String _id;
        private Integer buyerId;
        private Product product;
        private Quantity quantity;
        private Rate rate;
        private Tax tax;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public Integer getBuyerId() {
            return buyerId;
        }

        public void setBuyerId(Integer buyerId) {
            this.buyerId = buyerId;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public Quantity getQuantity() {
            return quantity;
        }

        public void setQuantity(Quantity quantity) {
            this.quantity = quantity;
        }

        public Rate getRate() {
            return rate;
        }

        public void setRate(Rate rate) {
            this.rate = rate;
        }

        public Tax getTax() {
            return tax;
        }

        public void setTax(Tax tax) {
            this.tax = tax;
        }

        public static class Quantity {
            public Integer qty;
            public String uom;

            public Integer getQty() {
                return qty;
            }

            public void setQty(Integer qty) {
                this.qty = qty;
            }

            public String getUom() {
                return uom;
            }

            public void setUom(String uom) {
                this.uom = uom;
            }

        }

        public static class Rate {
            public Double amount;
            public String currency;

            public Double getAmount() {
                return amount;
            }

            public void setAmount(Double amount) {
                this.amount = amount;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

        }

        public static class Tax {
            public Double taxValue;

            public Double getTaxValue() {
                return taxValue;
            }

            public void setTaxValue(Double taxValue) {
                this.taxValue = taxValue;
            }

        }


        public static class Product {
            private String _id;
            private String name;
            private String cpn;
            private Integer plantId;
            private Integer companyId;
            private String msn;
            private String modificationDate;
            private String creationDate;
            private Integer createdBy;
            private ProductType productType;
            private String hsnCode;
            private ProductPrice productPrice;
            private String uom;
            private Brand brand;
            private Boolean isActive;
            private Quantity quantity;
            private Rate rate;
            private Tax tax;


            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCpn() {
                return cpn;
            }

            public void setCpn(String cpn) {
                this.cpn = cpn;
            }

            public Integer getPlantId() {
                return plantId;
            }

            public void setPlantId(Integer plantId) {
                this.plantId = plantId;
            }

            public Integer getCompanyId() {
                return companyId;
            }

            public void setCompanyId(Integer companyId) {
                this.companyId = companyId;
            }

            public String getMsn() {
                return msn;
            }

            public void setMsn(String msn) {
                this.msn = msn;
            }

            public String getModificationDate() {
                return modificationDate;
            }

            public void setModificationDate(String modificationDate) {
                this.modificationDate = modificationDate;
            }

            public String getCreationDate() {
                return creationDate;
            }

            public void setCreationDate(String creationDate) {
                this.creationDate = creationDate;
            }

            public Integer getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(Integer createdBy) {
                this.createdBy = createdBy;
            }

            public ProductType getProductType() {
                return productType;
            }

            public void setProductType(ProductType productType) {
                this.productType = productType;
            }

            public String getHsnCode() {
                return hsnCode;
            }

            public void setHsnCode(String hsnCode) {
                this.hsnCode = hsnCode;
            }

            public ProductPrice getProductPrice() {
                return productPrice;
            }

            public void setProductPrice(ProductPrice productPrice) {
                this.productPrice = productPrice;
            }

            public String getUom() {
                return uom;
            }

            public void setUom(String uom) {
                this.uom = uom;
            }

            public Brand getBrand() {
                return brand;
            }

            public void setBrand(Brand brand) {
                this.brand = brand;
            }

            public Boolean getIsActive() {
                return isActive;
            }

            public void setIsActive(Boolean isActive) {
                this.isActive = isActive;
            }

            public Quantity getQuantity() {
                return quantity;
            }

            public void setQuantity(Quantity quantity) {
                this.quantity = quantity;
            }

            public Rate getRate() {
                return rate;
            }

            public void setRate(Rate rate) {
                this.rate = rate;
            }

            public Tax getTax() {
                return tax;
            }

            public void setTax(Tax tax) {
                this.tax = tax;
            }


            public static class ProductPrice {

                private Rate rate;

                public Rate getRate() {
                    return rate;
                }

                public void setRate(Rate rate) {
                    this.rate = rate;
                }

                public static class Rate {
                    public Double amount;
                    public String currency;

                    public Double getAmount() {
                        return amount;
                    }

                    public void setAmount(Double amount) {
                        this.amount = amount;
                    }

                    public String getCurrency() {
                        return currency;
                    }

                    public void setCurrency(String currency) {
                        this.currency = currency;
                    }

                }
            }

            public static class ProductType {
                private String _id;
                private String displayName;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }
            }

            public static class Brand {
                private String _id;
                private String displayName;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

            }


            public static class Quantity {
                public Integer qty;
                public String uom;

                public Integer getQty() {
                    return qty;
                }

                public void setQty(Integer qty) {
                    this.qty = qty;
                }

                public String getUom() {
                    return uom;
                }

                public void setUom(String uom) {
                    this.uom = uom;
                }

            }

            public static class Rate {
                public Double amount;
                public String currency;

                public Double getAmount() {
                    return amount;
                }

                public void setAmount(Double amount) {
                    this.amount = amount;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }

            }

            public static class Tax {
                public String taxType;
                public String taxValueType;
                public Double taxValue;


                public String getTaxType() {
                    return taxType;
                }

                public void setTaxType(String taxType) {
                    this.taxType = taxType;
                }

                public String getTaxValueType() {
                    return taxValueType;
                }

                public void setTaxValueType(String taxValueType) {
                    this.taxValueType = taxValueType;
                }

                public Double getTaxValue() {
                    return taxValue;
                }

                public void setTaxValue(Double taxValue) {
                    this.taxValue = taxValue;
                }

            }

        }

    }


    public static class Vendor {
        private String _id;
        private String gstn;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getGstn() {
            return gstn;
        }

        public void setGstn(String gstn) {
            this.gstn = gstn;
        }
    }

    public static class SapDetail {
        private String releaseFlag;
        private String orderDate;
        private String moglixReceivedDate;
        private String status;
        private String costCentre;
        private Boolean isGovtPO;
        private Double constTaxRate;
        private String purchaserId;
        private String poState;

        public String getReleaseFlag() {
            return releaseFlag;
        }

        public void setReleaseFlag(String releaseFlag) {
            this.releaseFlag = releaseFlag;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getMoglixReceivedDate() {
            return moglixReceivedDate;
        }

        public void setMoglixReceivedDate(String moglixReceivedDate) {
            this.moglixReceivedDate = moglixReceivedDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCostCentre() {
            return costCentre;
        }

        public void setCostCentre(String costCentre) {
            this.costCentre = costCentre;
        }

        public Boolean getIsGovtPO() {
            return isGovtPO;
        }

        public void setIsGovtPO(Boolean isGovtPO) {
            this.isGovtPO = isGovtPO;
        }

        public Double getConstTaxRate() {
            return constTaxRate;
        }

        public void setConstTaxRate(Double constTaxRate) {
            this.constTaxRate = constTaxRate;
        }

        public String getPurchaserId() {
            return purchaserId;
        }

        public void setPurchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
        }

        public String getPoState() {
            return poState;
        }

        public void setPoState(String poState) {
            this.poState = poState;
        }
    }

    public static class OtherCharge {
        private Double freight;
        private Double labour;
        private Double packaging;

        public Double getFreight() {
            return freight;
        }

        public void setFreight(Double freight) {
            this.freight = freight;
        }

        public Double getLabour() {
            return labour;
        }

        public void setLabour(Double labour) {
            this.labour = labour;
        }

        public Double getPackaging() {
            return packaging;
        }

        public void setPackaging(Double packaging) {
            this.packaging = packaging;
        }
    }

    public static class Attachment {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class Tax {
        private String taxType;
        private Double taxValue;

        public String getTaxType() {
            return taxType;
        }

        public void setTaxType(String taxType) {
            this.taxType = taxType;
        }

        public Double getTaxValue() {
            return taxValue;
        }

        public void setTaxValue(Double taxValue) {
            this.taxValue = taxValue;
        }
    }

  public static class PaymentTerms{

    private String term;
    private Integer value;

    public String getTerm() {return term; }

    public void setTerm(String term) {this.term=term; }

    public Integer getValue() {return value; }

    public void setValue(Integer value) {this.value=value; }
  }



}
