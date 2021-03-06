/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.tesseract.isservice.search.service;

import com.baidu.rigel.biplatform.tesseract.isservice.exception.IndexAndSearchException;
import com.baidu.rigel.biplatform.tesseract.qsservice.query.vo.QueryRequest;
import com.baidu.rigel.biplatform.tesseract.resultset.isservice.SearchIndexResultSet;

/**
 * 
 * 查询服务接口
 * @author lijin
 *
 */
public interface SearchService {
    
    /**
     * 
     * 从索引中查询数据
     * @param query QueryRequest
     * @return TesseractResultSet 返回TesseractResultSet数据接口
     * @throws IndexAndSearchException 可能抛出的异常
     */
    SearchIndexResultSet query(QueryRequest query) throws IndexAndSearchException ;
    
    /**
     * 判断当前的query是否使用索引
     * @param query
     * @return
     */
    boolean hasIndexMeta(QueryRequest query);
    
}
