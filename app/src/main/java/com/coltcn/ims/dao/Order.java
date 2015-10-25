package com.coltcn.ims.dao;

import java.util.List;
import com.coltcn.ims.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ORDER".
 */
public class Order {

    private Long id;
    private String orderNo;
    private String buyer;
    private String addresss;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient OrderDao myDao;

    private List<OrderDt> stocks;

    public Order() {
    }

    public Order(Long id) {
        this.id = id;
    }

    public Order(Long id, String orderNo, String buyer, String addresss) {
        this.id = id;
        this.orderNo = orderNo;
        this.buyer = buyer;
        this.addresss = addresss;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getOrderDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<OrderDt> getStocks() {
        if (stocks == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OrderDtDao targetDao = daoSession.getOrderDtDao();
            List<OrderDt> stocksNew = targetDao._queryOrder_Stocks(id);
            synchronized (this) {
                if(stocks == null) {
                    stocks = stocksNew;
                }
            }
        }
        return stocks;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetStocks() {
        stocks = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}