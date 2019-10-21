package jp.co.systena.tigerscave.springtest.application.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;

public class shoppingController {
  @RequestMapping(value = "/ApiHello") // URLとのマッピング
  public Map<String, String> hello() {

    Map<String, String> map = new HashMap<String, String>();
    map.put("パソコン", "マウス" + new java.util.Date());
    return map; // 文字列を返却
  }
}
