package ApplicationPages;

public class dummy {

    String x="INSERT INTO test \n" +
            "SET \n" +
            "BrandId = (SELECT brandId FROM brand WHERE brandName='brand'), \n" +
            "DataId = (\n" +
            "SELECT d.DataId FROM application a, test t, brand b, data d, script s\n" +
            "WHERE \n" +
            "t.BrandId = b.BrandId\n" +
            "AND a.AppId =d.AppId\n" +
            "AND t.dataId = d.dataId\n" +
            "AND s.ScriptId = d.ScriptId\n" +
            "AND a.AppName='Policy Center'\n" +
            "AND s.ScriptName='script'\n" +
            "AND (brandName = 'brand' OR BrandName = NULL)),\n" +
            "Output = 'Output'";
}
