/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import org.apache.openjpa.persistence.criteria.CompUser.CreditRating;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openjpa.persistence.criteria.CompUser.class)
public class CompUser_ {
    public static volatile SingularAttribute<CompUser,Address> address;
    public static volatile SingularAttribute<CompUser,Integer> age;
    public static volatile SingularAttribute<CompUser,String> computerName;
    public static volatile SingularAttribute<CompUser,CreditRating> creditRating;
    public static volatile SingularAttribute<CompUser,String> name;
    public static volatile ListAttribute<CompUser,String> nicknames;
    public static volatile SingularAttribute<CompUser,Integer> userid;
}
