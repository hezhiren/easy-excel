package io.github.mrdear.excel.domain;

import java.util.function.Function;

/**
 * excel header的封装
 * @author Quding Ding
 * @since 2018/6/27
 */
public class ExcelWriterHeader {
  /**
   * header展示名称
   */
  private String name;
  /**
   * 对应转换器
   */
  private Function<Object,Object> convert;

  private ExcelWriterHeader(String name, Function<Object,Object> convert) {
    this.name = name;
    this.convert = convert;
  }

  public static ExcelWriterHeader create(String name) {
    return new ExcelWriterHeader(name, Function.identity());
  }

  public static ExcelWriterHeader create(String name, Function<Object,Object> convert) {
    return new ExcelWriterHeader(name, convert);
  }

  public String getName() {
    return name;
  }

  public Function<Object,Object> getConvert() {
    return convert;
  }

}
