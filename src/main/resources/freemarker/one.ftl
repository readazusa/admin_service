你好啊 ${user!"堂堂一年"}

测试多级  ${(u.n.s)!0}
<#if users??>
   存在users
    <#list users as user>
        ${user}
    </#list>
<#else>
    不存在users
</#if>