package com.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andD_idIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andD_idIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andD_idEqualTo(Integer value) {
            addCriterion("d_id =", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThan(Integer value) {
            addCriterion("d_id >", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThan(Integer value) {
            addCriterion("d_id <", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idIn(List<Integer> values) {
            addCriterion("d_id in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idCarIsNull() {
            addCriterion("d_idCar is null");
            return (Criteria) this;
        }

        public Criteria andD_idCarIsNotNull() {
            addCriterion("d_idCar is not null");
            return (Criteria) this;
        }

        public Criteria andD_idCarEqualTo(String value) {
            addCriterion("d_idCar =", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarNotEqualTo(String value) {
            addCriterion("d_idCar <>", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarGreaterThan(String value) {
            addCriterion("d_idCar >", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarGreaterThanOrEqualTo(String value) {
            addCriterion("d_idCar >=", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarLessThan(String value) {
            addCriterion("d_idCar <", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarLessThanOrEqualTo(String value) {
            addCriterion("d_idCar <=", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarLike(String value) {
            addCriterion("d_idCar like", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarNotLike(String value) {
            addCriterion("d_idCar not like", value, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarIn(List<String> values) {
            addCriterion("d_idCar in", values, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarNotIn(List<String> values) {
            addCriterion("d_idCar not in", values, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarBetween(String value1, String value2) {
            addCriterion("d_idCar between", value1, value2, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_idCarNotBetween(String value1, String value2) {
            addCriterion("d_idCar not between", value1, value2, "d_idCar");
            return (Criteria) this;
        }

        public Criteria andD_phoneIsNull() {
            addCriterion("d_phone is null");
            return (Criteria) this;
        }

        public Criteria andD_phoneIsNotNull() {
            addCriterion("d_phone is not null");
            return (Criteria) this;
        }

        public Criteria andD_phoneEqualTo(Integer value) {
            addCriterion("d_phone =", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneNotEqualTo(Integer value) {
            addCriterion("d_phone <>", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneGreaterThan(Integer value) {
            addCriterion("d_phone >", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_phone >=", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneLessThan(Integer value) {
            addCriterion("d_phone <", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneLessThanOrEqualTo(Integer value) {
            addCriterion("d_phone <=", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneIn(List<Integer> values) {
            addCriterion("d_phone in", values, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneNotIn(List<Integer> values) {
            addCriterion("d_phone not in", values, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneBetween(Integer value1, Integer value2) {
            addCriterion("d_phone between", value1, value2, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneNotBetween(Integer value1, Integer value2) {
            addCriterion("d_phone not between", value1, value2, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneIsNull() {
            addCriterion("d_telPhone is null");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneIsNotNull() {
            addCriterion("d_telPhone is not null");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneEqualTo(String value) {
            addCriterion("d_telPhone =", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneNotEqualTo(String value) {
            addCriterion("d_telPhone <>", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneGreaterThan(String value) {
            addCriterion("d_telPhone >", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_telPhone >=", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneLessThan(String value) {
            addCriterion("d_telPhone <", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneLessThanOrEqualTo(String value) {
            addCriterion("d_telPhone <=", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneLike(String value) {
            addCriterion("d_telPhone like", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneNotLike(String value) {
            addCriterion("d_telPhone not like", value, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneIn(List<String> values) {
            addCriterion("d_telPhone in", values, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneNotIn(List<String> values) {
            addCriterion("d_telPhone not in", values, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneBetween(String value1, String value2) {
            addCriterion("d_telPhone between", value1, value2, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_telPhoneNotBetween(String value1, String value2) {
            addCriterion("d_telPhone not between", value1, value2, "d_telPhone");
            return (Criteria) this;
        }

        public Criteria andD_sexIsNull() {
            addCriterion("d_sex is null");
            return (Criteria) this;
        }

        public Criteria andD_sexIsNotNull() {
            addCriterion("d_sex is not null");
            return (Criteria) this;
        }

        public Criteria andD_sexEqualTo(Integer value) {
            addCriterion("d_sex =", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexNotEqualTo(Integer value) {
            addCriterion("d_sex <>", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexGreaterThan(Integer value) {
            addCriterion("d_sex >", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_sex >=", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexLessThan(Integer value) {
            addCriterion("d_sex <", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexLessThanOrEqualTo(Integer value) {
            addCriterion("d_sex <=", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexIn(List<Integer> values) {
            addCriterion("d_sex in", values, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexNotIn(List<Integer> values) {
            addCriterion("d_sex not in", values, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexBetween(Integer value1, Integer value2) {
            addCriterion("d_sex between", value1, value2, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexNotBetween(Integer value1, Integer value2) {
            addCriterion("d_sex not between", value1, value2, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_birthdayIsNull() {
            addCriterion("d_birthday is null");
            return (Criteria) this;
        }

        public Criteria andD_birthdayIsNotNull() {
            addCriterion("d_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andD_birthdayEqualTo(String value) {
            addCriterion("d_birthday =", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotEqualTo(String value) {
            addCriterion("d_birthday <>", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayGreaterThan(String value) {
            addCriterion("d_birthday >", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayGreaterThanOrEqualTo(String value) {
            addCriterion("d_birthday >=", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayLessThan(String value) {
            addCriterion("d_birthday <", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayLessThanOrEqualTo(String value) {
            addCriterion("d_birthday <=", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayLike(String value) {
            addCriterion("d_birthday like", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotLike(String value) {
            addCriterion("d_birthday not like", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayIn(List<String> values) {
            addCriterion("d_birthday in", values, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotIn(List<String> values) {
            addCriterion("d_birthday not in", values, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayBetween(String value1, String value2) {
            addCriterion("d_birthday between", value1, value2, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotBetween(String value1, String value2) {
            addCriterion("d_birthday not between", value1, value2, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_ageIsNull() {
            addCriterion("d_age is null");
            return (Criteria) this;
        }

        public Criteria andD_ageIsNotNull() {
            addCriterion("d_age is not null");
            return (Criteria) this;
        }

        public Criteria andD_ageEqualTo(Integer value) {
            addCriterion("d_age =", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageNotEqualTo(Integer value) {
            addCriterion("d_age <>", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageGreaterThan(Integer value) {
            addCriterion("d_age >", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_age >=", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageLessThan(Integer value) {
            addCriterion("d_age <", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageLessThanOrEqualTo(Integer value) {
            addCriterion("d_age <=", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageIn(List<Integer> values) {
            addCriterion("d_age in", values, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageNotIn(List<Integer> values) {
            addCriterion("d_age not in", values, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageBetween(Integer value1, Integer value2) {
            addCriterion("d_age between", value1, value2, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("d_age not between", value1, value2, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_emailIsNull() {
            addCriterion("d_email is null");
            return (Criteria) this;
        }

        public Criteria andD_emailIsNotNull() {
            addCriterion("d_email is not null");
            return (Criteria) this;
        }

        public Criteria andD_emailEqualTo(String value) {
            addCriterion("d_email =", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotEqualTo(String value) {
            addCriterion("d_email <>", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailGreaterThan(String value) {
            addCriterion("d_email >", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailGreaterThanOrEqualTo(String value) {
            addCriterion("d_email >=", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailLessThan(String value) {
            addCriterion("d_email <", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailLessThanOrEqualTo(String value) {
            addCriterion("d_email <=", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailLike(String value) {
            addCriterion("d_email like", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotLike(String value) {
            addCriterion("d_email not like", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailIn(List<String> values) {
            addCriterion("d_email in", values, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotIn(List<String> values) {
            addCriterion("d_email not in", values, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailBetween(String value1, String value2) {
            addCriterion("d_email between", value1, value2, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotBetween(String value1, String value2) {
            addCriterion("d_email not between", value1, value2, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_keshiIsNull() {
            addCriterion("d_keshi is null");
            return (Criteria) this;
        }

        public Criteria andD_keshiIsNotNull() {
            addCriterion("d_keshi is not null");
            return (Criteria) this;
        }

        public Criteria andD_keshiEqualTo(String value) {
            addCriterion("d_keshi =", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiNotEqualTo(String value) {
            addCriterion("d_keshi <>", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiGreaterThan(String value) {
            addCriterion("d_keshi >", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiGreaterThanOrEqualTo(String value) {
            addCriterion("d_keshi >=", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiLessThan(String value) {
            addCriterion("d_keshi <", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiLessThanOrEqualTo(String value) {
            addCriterion("d_keshi <=", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiLike(String value) {
            addCriterion("d_keshi like", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiNotLike(String value) {
            addCriterion("d_keshi not like", value, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiIn(List<String> values) {
            addCriterion("d_keshi in", values, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiNotIn(List<String> values) {
            addCriterion("d_keshi not in", values, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiBetween(String value1, String value2) {
            addCriterion("d_keshi between", value1, value2, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_keshiNotBetween(String value1, String value2) {
            addCriterion("d_keshi not between", value1, value2, "d_keshi");
            return (Criteria) this;
        }

        public Criteria andD_xueliIsNull() {
            addCriterion("d_xueli is null");
            return (Criteria) this;
        }

        public Criteria andD_xueliIsNotNull() {
            addCriterion("d_xueli is not null");
            return (Criteria) this;
        }

        public Criteria andD_xueliEqualTo(String value) {
            addCriterion("d_xueli =", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotEqualTo(String value) {
            addCriterion("d_xueli <>", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliGreaterThan(String value) {
            addCriterion("d_xueli >", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliGreaterThanOrEqualTo(String value) {
            addCriterion("d_xueli >=", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliLessThan(String value) {
            addCriterion("d_xueli <", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliLessThanOrEqualTo(String value) {
            addCriterion("d_xueli <=", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliLike(String value) {
            addCriterion("d_xueli like", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotLike(String value) {
            addCriterion("d_xueli not like", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliIn(List<String> values) {
            addCriterion("d_xueli in", values, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotIn(List<String> values) {
            addCriterion("d_xueli not in", values, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliBetween(String value1, String value2) {
            addCriterion("d_xueli between", value1, value2, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotBetween(String value1, String value2) {
            addCriterion("d_xueli not between", value1, value2, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_descIsNull() {
            addCriterion("d_desc is null");
            return (Criteria) this;
        }

        public Criteria andD_descIsNotNull() {
            addCriterion("d_desc is not null");
            return (Criteria) this;
        }

        public Criteria andD_descEqualTo(String value) {
            addCriterion("d_desc =", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotEqualTo(String value) {
            addCriterion("d_desc <>", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descGreaterThan(String value) {
            addCriterion("d_desc >", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descGreaterThanOrEqualTo(String value) {
            addCriterion("d_desc >=", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descLessThan(String value) {
            addCriterion("d_desc <", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descLessThanOrEqualTo(String value) {
            addCriterion("d_desc <=", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descLike(String value) {
            addCriterion("d_desc like", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotLike(String value) {
            addCriterion("d_desc not like", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descIn(List<String> values) {
            addCriterion("d_desc in", values, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotIn(List<String> values) {
            addCriterion("d_desc not in", values, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descBetween(String value1, String value2) {
            addCriterion("d_desc between", value1, value2, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotBetween(String value1, String value2) {
            addCriterion("d_desc not between", value1, value2, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_inTimeIsNull() {
            addCriterion("d_inTime is null");
            return (Criteria) this;
        }

        public Criteria andD_inTimeIsNotNull() {
            addCriterion("d_inTime is not null");
            return (Criteria) this;
        }

        public Criteria andD_inTimeEqualTo(Date value) {
            addCriterion("d_inTime =", value, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeNotEqualTo(Date value) {
            addCriterion("d_inTime <>", value, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeGreaterThan(Date value) {
            addCriterion("d_inTime >", value, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_inTime >=", value, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeLessThan(Date value) {
            addCriterion("d_inTime <", value, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_inTime <=", value, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeIn(List<Date> values) {
            addCriterion("d_inTime in", values, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeNotIn(List<Date> values) {
            addCriterion("d_inTime not in", values, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeBetween(Date value1, Date value2) {
            addCriterion("d_inTime between", value1, value2, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_inTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_inTime not between", value1, value2, "d_inTime");
            return (Criteria) this;
        }

        public Criteria andD_stateIsNull() {
            addCriterion("d_state is null");
            return (Criteria) this;
        }

        public Criteria andD_stateIsNotNull() {
            addCriterion("d_state is not null");
            return (Criteria) this;
        }

        public Criteria andD_stateEqualTo(Integer value) {
            addCriterion("d_state =", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateNotEqualTo(Integer value) {
            addCriterion("d_state <>", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateGreaterThan(Integer value) {
            addCriterion("d_state >", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_state >=", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateLessThan(Integer value) {
            addCriterion("d_state <", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateLessThanOrEqualTo(Integer value) {
            addCriterion("d_state <=", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateIn(List<Integer> values) {
            addCriterion("d_state in", values, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateNotIn(List<Integer> values) {
            addCriterion("d_state not in", values, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateBetween(Integer value1, Integer value2) {
            addCriterion("d_state between", value1, value2, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("d_state not between", value1, value2, "d_state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}