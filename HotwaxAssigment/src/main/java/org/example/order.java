package org.example;

import java.time.LocalDate;

public class order {

        private String orderName;
        private String currencyUomId;
        private String statusId;
        private String salesChannelEnumId;
        private String productStoreId;
        private LocalDate placedDate;
        private LocalDate approvedDate;

        // Constructor
        public order(String orderName, String currencyUomId, String statusId, String salesChannelEnumId, String productStoreId, LocalDate placedDate, LocalDate approvedDate) {
            this.orderName = orderName;
            this.currencyUomId = currencyUomId;
            this.statusId = statusId;
            this.salesChannelEnumId = salesChannelEnumId;
            this.productStoreId = productStoreId;
            this.placedDate = placedDate;
            this.approvedDate = approvedDate;
        }


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public LocalDate getPlacedDate() {
        return placedDate;
    }

    public void setPlacedDate(LocalDate placedDate) {
        this.placedDate = placedDate;
    }

    public LocalDate getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(LocalDate approvedDate) {
        this.approvedDate = approvedDate;
    }

    @Override
        public String toString() {
            return "Order{" +
                    "orderName='" + orderName + '\'' +
                    ", currencyUomId='" + currencyUomId + '\'' +
                    ", statusId='" + statusId + '\'' +
                    ", salesChannelEnumId='" + salesChannelEnumId + '\'' +
                    ", productStoreId='" + productStoreId + '\'' +
                    ", placedDate=" + placedDate +
                    ", approvedDate=" + approvedDate +
                    '}';
        }
    }


