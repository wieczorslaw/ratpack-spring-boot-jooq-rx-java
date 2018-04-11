/*
 * This file is generated by jOOQ.
*/
package pl.homecenter.japlace.generated.db.tables.daos;


import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import pl.homecenter.japlace.generated.db.tables.JpPayments;
import pl.homecenter.japlace.generated.db.tables.records.JpPaymentsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JpPaymentsDao extends DAOImpl<JpPaymentsRecord, pl.homecenter.japlace.generated.db.tables.pojos.JpPayments, Object> {

    /**
     * Create a new JpPaymentsDao without any configuration
     */
    public JpPaymentsDao() {
        super(JpPayments.JP_PAYMENTS, pl.homecenter.japlace.generated.db.tables.pojos.JpPayments.class);
    }

    /**
     * Create a new JpPaymentsDao with an attached configuration
     */
    public JpPaymentsDao(Configuration configuration) {
        super(JpPayments.JP_PAYMENTS, pl.homecenter.japlace.generated.db.tables.pojos.JpPayments.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getId(pl.homecenter.japlace.generated.db.tables.pojos.JpPayments object) {
        return object.getPmnId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnId(Object... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_ID, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public pl.homecenter.japlace.generated.db.tables.pojos.JpPayments fetchOneByPmnId(Object value) {
        return fetchOne(JpPayments.JP_PAYMENTS.PMN_ID, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnVndId(Object... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_VND_ID, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnTitle(Object... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_TITLE, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnAmount(Object... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>PMN_CREATE_DATE IN (values)</code>
     */
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnCreateDate(Date... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>PMN_FINAL_DATE IN (values)</code>
     */
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnFinalDate(Date... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_FINAL_DATE, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnIban(Object... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_IBAN, values);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public List<pl.homecenter.japlace.generated.db.tables.pojos.JpPayments> fetchByPmnHstId(Object... values) {
        return fetch(JpPayments.JP_PAYMENTS.PMN_HST_ID, values);
    }
}
