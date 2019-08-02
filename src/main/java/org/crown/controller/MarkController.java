package org.crown.controller;

import io.swagger.annotations.ApiOperation;
import org.crown.common.annotations.Resources;
import org.crown.enums.AuthTypeEnum;
import org.crown.framework.controller.SuperController;
import org.crown.framework.responses.ApiResponses;
import org.crown.model.entity.Menu;
import org.crown.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * 记录模块
 */

@RestController
@RequestMapping(value = "/menus", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MarkController extends SuperController {

    @Autowired
    private MarkService markService;

 /*   @Resources(auth = AuthTypeEnum.AUTH)
    @ApiOperation(value = "查询所有菜单")
    @GetMapping
    public ApiResponses<List<Menu>> list() {
        return success(markService.list());
    }*/
}
