package org.vinci.codesmith.template.info

/**
 * Created by XizeTian on 2016/12/19.
 */
class ClassTemplateInfo extends TemplateBaseInfo {
    final List<FieldTemplateInfo> fields = new ArrayList<>()
    String                        sqlName
    String                        comment
}