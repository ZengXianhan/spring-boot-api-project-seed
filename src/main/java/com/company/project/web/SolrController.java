package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Item;
import com.company.project.model.SolrModel;
import com.company.project.model.StoreItem;
import com.company.project.service.ItemService;
import com.company.project.service.StoreItemService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/solr")
public class SolrController {
    @Resource
    ItemService itemService;
    @Resource
    StoreItemService storeItemService;

    HttpSolrClient solrClient = new HttpSolrClient("http://45.77.43.43:8080/solr/new_core");

    @GetMapping("/search/item")
    public Result search(@RequestParam String text){
        List<Item> itemList = itemService.findAll();
        List<SolrModel> solrModels = new ArrayList<>();
        for (Item i :
                itemList) {
            SolrModel solrModel = new SolrModel(i.getItemId().toString(),i.getItemName());
            solrModels.add(solrModel);
        }
        SolrDocumentList results = new SolrDocumentList();
        try {
            solrClient.deleteByQuery("*:*" );
            solrClient.addBeans(solrModels);
            solrClient.commit();
            SolrQuery params = new SolrQuery();
            //查询条件, 这里的 q 对应 下面图片标红的地方
            params.set("q", text);
            //过滤条件
            //params.set("fq", "product_price:[100 TO 100000]");
            //排序
            //params.addSort("product_price", SolrQuery.ORDER.asc);
            //分页
            //params.setStart(0);
            //params.setRows(20);
            //默认域
            //params.set("df", "product_title");
            //只查询指定域
           // params.set("fl", "id,product_title,product_price");
            //高亮
            //打开开关
            //params.setHighlight(true);
            //指定高亮域
            //params.addHighlightField("product_title");
            //设置前缀
            //params.setHighlightSimplePre("<span style='color:red'>");
            //设置后缀
            //params.setHighlightSimplePost("</span>");

            QueryResponse queryResponse = solrClient.query(params);

            results = queryResponse.getResults();

            //获取高亮显示的结果, 高亮显示的结果和查询结果是分开放的
            //Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();

//            for (SolrDocument result : results) {
//                Map<String, List<String>> map = highlight.get(result.get("id"));
//                List<String> list = map.get("product_title");
//            }
//            return highlight;
//            List<LinkedHashMap<String,String>> resultMaps = new ArrayList<>();
//            for (SolrDocument result : results) {
//                LinkedHashMap<String, List<String>> map = highlight.get(result.get("id"));
//                List<String> list = map.get("product_title");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultGenerator.genSuccessResult(results);
    }

    @GetMapping("/search/store/item")
    public Result searchStoreItem(@RequestParam String text){
        List<StoreItem> itemList = storeItemService.findAll();
        List<SolrModel> solrModels = new ArrayList<>();
        for (StoreItem i :
                itemList) {
            SolrModel solrModel = new SolrModel(i.getSiId().toString(),i.getSiName());
            solrModels.add(solrModel);
        }
        SolrDocumentList results = new SolrDocumentList();
        try {
            solrClient.deleteByQuery("*:*" );
            solrClient.addBeans(solrModels);
            solrClient.commit();
            SolrQuery params = new SolrQuery();
            //查询条件, 这里的 q 对应 下面图片标红的地方

            params.set("q", text);

            //过滤条件
            //params.set("fq", "product_price:[100 TO 100000]");
            //排序
            //params.addSort("product_price", SolrQuery.ORDER.asc);
            //分页
            //params.setStart(0);
            //params.setRows(20);
            //默认域
            //params.set("df", "product_title");
            //只查询指定域
            // params.set("fl", "id,product_title,product_price");
            //高亮
            //打开开关
            //params.setHighlight(true);
            //指定高亮域
            //params.addHighlightField("product_title");
            //设置前缀
            //params.setHighlightSimplePre("<span style='color:red'>");
            //设置后缀
            //params.setHighlightSimplePost("</span>");

            QueryResponse queryResponse = solrClient.query(params);

            results = queryResponse.getResults();

            //获取高亮显示的结果, 高亮显示的结果和查询结果是分开放的
            //Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();

//            for (SolrDocument result : results) {
//                Map<String, List<String>> map = highlight.get(result.get("id"));
//                List<String> list = map.get("product_title");
//            }
//            return highlight;
//            List<LinkedHashMap<String,String>> resultMaps = new ArrayList<>();
//            for (SolrDocument result : results) {
//                LinkedHashMap<String, List<String>> map = highlight.get(result.get("id"));
//                List<String> list = map.get("product_title");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultGenerator.genSuccessResult(results);
    }
}
