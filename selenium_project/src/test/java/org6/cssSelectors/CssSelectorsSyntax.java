package org6.cssSelectors;

public class CssSelectorsSyntax {
	/*
	 * *1.Using id attribute:- 
	 * Syntax:- #idvalue or htmlTag#idvalue
	 * 
	 * *2.Using class attribute:- 
	 * Syntax:- .classValue or htmlTag.classValue
	 * 
	 * *3.Using any attribute:- 
	 * Syntax:- htmlTag[attributeName='attributevalue']
	 * 
	 * *4.css with regex(handling dynamic attribue):- 
	 * Syntax:-
	 * htmltag[attributeName^='attributeValue'] 
	 * Ex:-
	 * htmltag[attributeName^='attributeValue_'] (last dynamic) 
	 * 
	 * Syntax:-
	 * htmltag[attributeName$='attributeValue'] 
	 * Ex:-
	 * htmltag[attributeName$='_attributeValue'] (first dynamic) 
	 * 
	 * Syntax:-
	 * htmltag[attributeName*='attributeValue'] 
	 * Ex:-
	 * htmltag[attributeName*='attributeValue'] (one value fixed anywhere (contain))
	 * 
	 * *5.Based on position:-
	 * Syntax:-
	 *        *:first-child
	 *        *:last-child
	 *        *:nth-child(position)
	 *        htmlTag:nth-of-type(position)
	 * *6.Direct Indirect Child:-
	 * Direct: parentObjectExpression>childObjectExpression
	 * Indirect: parentObjectExpression anychildObjectExpression
	 * 
	 * Absolute expression:
	 * html>body>#app>*:nth-child(1)>div>.orangehrm-login-container>div>*:last-child
	 * >.orangehrm-login-form>form>div:nth-of-type(1)>div>div:nth-of-type(2)>input
	 * 
	 * Relative expression:-
	 * html>body #loginFormDiv>form>div:nth-of-type(1)>input
	 * 
	 * form>p>input or form>p>input[name='Username'] or form>p>#username 
	 * or form>p>input#username 
	 * 
	 * form input or form input[name='Username'] or form #username or form input#username
	 * 
	 * orangeCrm:-
	 * html>body>div#wrapper>#content>div#divLogin>#divLoginImageContainer
	 * >#divLoginForm>#frmLogin>#divUsername>input[name='txtUsername']
	 */
}
