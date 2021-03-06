/*
* generated by Xtext
*/
package org.cloudsmith.geppetto.pp.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.cloudsmith.geppetto.pp.dsl.services.PPGrammarAccess;

public class PPParser extends AbstractContentAssistParser {
	
	@Inject
	private PPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.cloudsmith.geppetto.pp.dsl.ui.contentassist.antlr.internal.InternalPPParser createParser() {
		org.cloudsmith.geppetto.pp.dsl.ui.contentassist.antlr.internal.InternalPPParser result = new org.cloudsmith.geppetto.pp.dsl.ui.contentassist.antlr.internal.InternalPPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEdgeOperatorAccess().getAlternatives(), "rule__EdgeOperator__Alternatives");
					put(grammarAccess.getResourceExpressionAccess().getAlternatives(), "rule__ResourceExpression__Alternatives");
					put(grammarAccess.getResourceBodyAccess().getAlternatives(), "rule__ResourceBody__Alternatives");
					put(grammarAccess.getAttributeOperationAccess().getOpAlternatives_2_0_0(), "rule__AttributeOperation__OpAlternatives_2_0_0");
					put(grammarAccess.getAttributeOperationsAccess().getAlternatives_1(), "rule__AttributeOperations__Alternatives_1");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getShiftOperatorAccess().getAlternatives(), "rule__ShiftOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getMatchingOperatorAccess().getAlternatives(), "rule__MatchingOperator__Alternatives");
					put(grammarAccess.getUnaryOrHigherExpressionAccess().getAlternatives(), "rule__UnaryOrHigherExpression__Alternatives");
					put(grammarAccess.getCollectQueryAccess().getAlternatives(), "rule__CollectQuery__Alternatives");
					put(grammarAccess.getSelectorExpressionAccess().getAlternatives_1_2(), "rule__SelectorExpression__Alternatives_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getHostReferenceAccess().getAlternatives(), "rule__HostReference__Alternatives");
					put(grammarAccess.getParentNameAccess().getAlternatives(), "rule__ParentName__Alternatives");
					put(grammarAccess.getDefinitionArgumentAccess().getAlternatives_1_0(), "rule__DefinitionArgument__Alternatives_1_0");
					put(grammarAccess.getIfExpressionAccess().getAlternatives_5(), "rule__IfExpression__Alternatives_5");
					put(grammarAccess.getElseIfExpressionAccess().getAlternatives_5(), "rule__ElseIfExpression__Alternatives_5");
					put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
					put(grammarAccess.getUNION_VARIABLE_OR_NAMEAccess().getAlternatives(), "rule__UNION_VARIABLE_OR_NAME__Alternatives");
					put(grammarAccess.getLiteralNameOrStringAccess().getAlternatives(), "rule__LiteralNameOrString__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
					put(grammarAccess.getStringExpressionAccess().getAlternatives(), "rule__StringExpression__Alternatives");
					put(grammarAccess.getQuotedStringAccess().getAlternatives(), "rule__QuotedString__Alternatives");
					put(grammarAccess.getTextExpressionAccess().getAlternatives(), "rule__TextExpression__Alternatives");
					put(grammarAccess.getKeywordAccess().getAlternatives(), "rule__Keyword__Alternatives");
					put(grammarAccess.getClassnameAccess().getAlternatives(), "rule__Classname__Alternatives");
					put(grammarAccess.getUnionNameOrReferenceAccess().getAlternatives(), "rule__UnionNameOrReference__Alternatives");
					put(grammarAccess.getDoubleStringCharactersAccess().getAlternatives(), "rule__DoubleStringCharacters__Alternatives");
					put(grammarAccess.getSingleStringCharactersAccess().getAlternatives(), "rule__SingleStringCharacters__Alternatives");
					put(grammarAccess.getPuppetManifestAccess().getGroup(), "rule__PuppetManifest__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1_3(), "rule__ExpressionList__Group_1_3__0");
					put(grammarAccess.getRelationshipExpressionAccess().getGroup(), "rule__RelationshipExpression__Group__0");
					put(grammarAccess.getRelationshipExpressionAccess().getGroup_1(), "rule__RelationshipExpression__Group_1__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_0(), "rule__ResourceExpression__Group_0__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_0_1(), "rule__ResourceExpression__Group_0_1__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_0_1_2(), "rule__ResourceExpression__Group_0_1_2__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_0_1_2_1(), "rule__ResourceExpression__Group_0_1_2_1__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_1(), "rule__ResourceExpression__Group_1__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_1_3(), "rule__ResourceExpression__Group_1_3__0");
					put(grammarAccess.getResourceExpressionAccess().getGroup_1_3_1(), "rule__ResourceExpression__Group_1_3_1__0");
					put(grammarAccess.getResourceBodyAccess().getGroup_0(), "rule__ResourceBody__Group_0__0");
					put(grammarAccess.getAttributeOperationAccess().getGroup(), "rule__AttributeOperation__Group__0");
					put(grammarAccess.getAttributeOperationAccess().getGroup_2(), "rule__AttributeOperation__Group_2__0");
					put(grammarAccess.getAttributeOperationsAccess().getGroup(), "rule__AttributeOperations__Group__0");
					put(grammarAccess.getAttributeOperationsAccess().getGroup_1_0(), "rule__AttributeOperations__Group_1_0__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup(), "rule__AssignmentExpression__Group__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup_1(), "rule__AssignmentExpression__Group_1__0");
					put(grammarAccess.getAppendExpressionAccess().getGroup(), "rule__AppendExpression__Group__0");
					put(grammarAccess.getAppendExpressionAccess().getGroup_1(), "rule__AppendExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup(), "rule__ShiftExpression__Group__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup_1(), "rule__ShiftExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMatchingExpressionAccess().getGroup(), "rule__MatchingExpression__Group__0");
					put(grammarAccess.getMatchingExpressionAccess().getGroup_1(), "rule__MatchingExpression__Group_1__0");
					put(grammarAccess.getInExpressionAccess().getGroup(), "rule__InExpression__Group__0");
					put(grammarAccess.getInExpressionAccess().getGroup_1(), "rule__InExpression__Group_1__0");
					put(grammarAccess.getUnaryMinusExpressionAccess().getGroup(), "rule__UnaryMinusExpression__Group__0");
					put(grammarAccess.getNotExpressionAccess().getGroup(), "rule__NotExpression__Group__0");
					put(grammarAccess.getCollectExpressionAccess().getGroup(), "rule__CollectExpression__Group__0");
					put(grammarAccess.getCollectExpressionAccess().getGroup_1(), "rule__CollectExpression__Group_1__0");
					put(grammarAccess.getCollectExpressionAccess().getGroup_1_2(), "rule__CollectExpression__Group_1_2__0");
					put(grammarAccess.getVirtualCollectQueryAccess().getGroup(), "rule__VirtualCollectQuery__Group__0");
					put(grammarAccess.getExportedCollectQueryAccess().getGroup(), "rule__ExportedCollectQuery__Group__0");
					put(grammarAccess.getSelectorExpressionAccess().getGroup(), "rule__SelectorExpression__Group__0");
					put(grammarAccess.getSelectorExpressionAccess().getGroup_1(), "rule__SelectorExpression__Group_1__0");
					put(grammarAccess.getSelectorExpressionAccess().getGroup_1_2_0(), "rule__SelectorExpression__Group_1_2_0__0");
					put(grammarAccess.getSelectorExpressionAccess().getGroup_1_2_0_2(), "rule__SelectorExpression__Group_1_2_0_2__0");
					put(grammarAccess.getSelectorEntryAccess().getGroup(), "rule__SelectorEntry__Group__0");
					put(grammarAccess.getSelectorEntryAccess().getGroup_1(), "rule__SelectorEntry__Group_1__0");
					put(grammarAccess.getAtExpressionAccess().getGroup(), "rule__AtExpression__Group__0");
					put(grammarAccess.getAtExpressionAccess().getGroup_1(), "rule__AtExpression__Group_1__0");
					put(grammarAccess.getAtExpressionAccess().getGroup_1_2(), "rule__AtExpression__Group_1_2__0");
					put(grammarAccess.getAtExpressionAccess().getGroup_1_2_1(), "rule__AtExpression__Group_1_2_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_2(), "rule__FunctionCall__Group_1_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_1_2_1(), "rule__FunctionCall__Group_1_2_1__0");
					put(grammarAccess.getNodeDefinitionAccess().getGroup(), "rule__NodeDefinition__Group__0");
					put(grammarAccess.getNodeDefinitionAccess().getGroup_2(), "rule__NodeDefinition__Group_2__0");
					put(grammarAccess.getNodeDefinitionAccess().getGroup_3(), "rule__NodeDefinition__Group_3__0");
					put(grammarAccess.getHostClassDefinitionAccess().getGroup(), "rule__HostClassDefinition__Group__0");
					put(grammarAccess.getHostClassDefinitionAccess().getGroup_3(), "rule__HostClassDefinition__Group_3__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getDefinitionArgumentListAccess().getGroup(), "rule__DefinitionArgumentList__Group__0");
					put(grammarAccess.getDefinitionArgumentListAccess().getGroup_2(), "rule__DefinitionArgumentList__Group_2__0");
					put(grammarAccess.getDefinitionArgumentListAccess().getGroup_2_1(), "rule__DefinitionArgumentList__Group_2_1__0");
					put(grammarAccess.getDefinitionArgumentAccess().getGroup(), "rule__DefinitionArgument__Group__0");
					put(grammarAccess.getDefinitionArgumentAccess().getGroup_1(), "rule__DefinitionArgument__Group_1__0");
					put(grammarAccess.getCaseExpressionAccess().getGroup(), "rule__CaseExpression__Group__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getCaseAccess().getGroup_1(), "rule__Case__Group_1__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getIfExpressionAccess().getGroup_5_0(), "rule__IfExpression__Group_5_0__0");
					put(grammarAccess.getIfExpressionAccess().getGroup_5_1(), "rule__IfExpression__Group_5_1__0");
					put(grammarAccess.getElseExpressionAccess().getGroup(), "rule__ElseExpression__Group__0");
					put(grammarAccess.getElseIfExpressionAccess().getGroup(), "rule__ElseIfExpression__Group__0");
					put(grammarAccess.getElseIfExpressionAccess().getGroup_5_0(), "rule__ElseIfExpression__Group_5_0__0");
					put(grammarAccess.getElseIfExpressionAccess().getGroup_5_1(), "rule__ElseIfExpression__Group_5_1__0");
					put(grammarAccess.getParenthisedExpressionAccess().getGroup(), "rule__ParenthisedExpression__Group__0");
					put(grammarAccess.getVirtualNameOrReferenceAccess().getGroup(), "rule__VirtualNameOrReference__Group__0");
					put(grammarAccess.getImportExpressionAccess().getGroup(), "rule__ImportExpression__Group__0");
					put(grammarAccess.getImportExpressionAccess().getGroup_2(), "rule__ImportExpression__Group_2__0");
					put(grammarAccess.getImportExpressionAccess().getGroup_2_1(), "rule__ImportExpression__Group_2_1__0");
					put(grammarAccess.getLiteralListAccess().getGroup(), "rule__LiteralList__Group__0");
					put(grammarAccess.getLiteralListAccess().getGroup_2(), "rule__LiteralList__Group_2__0");
					put(grammarAccess.getLiteralListAccess().getGroup_2_1(), "rule__LiteralList__Group_2_1__0");
					put(grammarAccess.getLiteralHashAccess().getGroup(), "rule__LiteralHash__Group__0");
					put(grammarAccess.getLiteralHashAccess().getGroup_2(), "rule__LiteralHash__Group_2__0");
					put(grammarAccess.getLiteralHashAccess().getGroup_2_1(), "rule__LiteralHash__Group_2_1__0");
					put(grammarAccess.getHashEntryAccess().getGroup(), "rule__HashEntry__Group__0");
					put(grammarAccess.getLiteralDefaultAccess().getGroup(), "rule__LiteralDefault__Group__0");
					put(grammarAccess.getLiteralUndefAccess().getGroup(), "rule__LiteralUndef__Group__0");
					put(grammarAccess.getLiteralClassAccess().getGroup(), "rule__LiteralClass__Group__0");
					put(grammarAccess.getSingleQuotedStringAccess().getGroup(), "rule__SingleQuotedString__Group__0");
					put(grammarAccess.getDoubleQuotedStringAccess().getGroup(), "rule__DoubleQuotedString__Group__0");
					put(grammarAccess.getTextExpressionAccess().getGroup_0(), "rule__TextExpression__Group_0__0");
					put(grammarAccess.getTextExpressionAccess().getGroup_1(), "rule__TextExpression__Group_1__0");
					put(grammarAccess.getTextExpressionAccess().getGroup_2(), "rule__TextExpression__Group_2__0");
					put(grammarAccess.getExpressionWithHiddenAccess().getGroup(), "rule__ExpressionWithHidden__Group__0");
					put(grammarAccess.getStringPartAccess().getGroup(), "rule__StringPart__Group__0");
					put(grammarAccess.getUnquotedStringAccess().getGroup(), "rule__UnquotedString__Group__0");
					put(grammarAccess.getSqTextAccess().getGroup(), "rule__SqText__Group__0");
					put(grammarAccess.getPuppetManifestAccess().getStatementsAssignment_1(), "rule__PuppetManifest__StatementsAssignment_1");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_2(), "rule__ExpressionList__ExpressionsAssignment_1_2");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_3_1(), "rule__ExpressionList__ExpressionsAssignment_1_3_1");
					put(grammarAccess.getRelationshipExpressionAccess().getOpNameAssignment_1_1(), "rule__RelationshipExpression__OpNameAssignment_1_1");
					put(grammarAccess.getRelationshipExpressionAccess().getRightExprAssignment_1_2(), "rule__RelationshipExpression__RightExprAssignment_1_2");
					put(grammarAccess.getResourceExpressionAccess().getResourceDataAssignment_0_1_2_0(), "rule__ResourceExpression__ResourceDataAssignment_0_1_2_0");
					put(grammarAccess.getResourceExpressionAccess().getResourceDataAssignment_0_1_2_1_1(), "rule__ResourceExpression__ResourceDataAssignment_0_1_2_1_1");
					put(grammarAccess.getResourceExpressionAccess().getResourceExprAssignment_1_1(), "rule__ResourceExpression__ResourceExprAssignment_1_1");
					put(grammarAccess.getResourceExpressionAccess().getResourceDataAssignment_1_3_0(), "rule__ResourceExpression__ResourceDataAssignment_1_3_0");
					put(grammarAccess.getResourceExpressionAccess().getResourceDataAssignment_1_3_1_1(), "rule__ResourceExpression__ResourceDataAssignment_1_3_1_1");
					put(grammarAccess.getResourceBodyAccess().getNameExprAssignment_0_0(), "rule__ResourceBody__NameExprAssignment_0_0");
					put(grammarAccess.getResourceBodyAccess().getAttributesAssignment_0_2(), "rule__ResourceBody__AttributesAssignment_0_2");
					put(grammarAccess.getResourceBodyAccess().getAttributesAssignment_1(), "rule__ResourceBody__AttributesAssignment_1");
					put(grammarAccess.getAttributeOperationAccess().getKeyAssignment_1(), "rule__AttributeOperation__KeyAssignment_1");
					put(grammarAccess.getAttributeOperationAccess().getOpAssignment_2_0(), "rule__AttributeOperation__OpAssignment_2_0");
					put(grammarAccess.getAttributeOperationAccess().getValueAssignment_2_1(), "rule__AttributeOperation__ValueAssignment_2_1");
					put(grammarAccess.getAttributeOperationsAccess().getAttributesAssignment_0(), "rule__AttributeOperations__AttributesAssignment_0");
					put(grammarAccess.getAttributeOperationsAccess().getAttributesAssignment_1_0_1(), "rule__AttributeOperations__AttributesAssignment_1_0_1");
					put(grammarAccess.getAttributeOperationsAccess().getAttributesAssignment_1_1(), "rule__AttributeOperations__AttributesAssignment_1_1");
					put(grammarAccess.getAssignmentExpressionAccess().getRightExprAssignment_1_2(), "rule__AssignmentExpression__RightExprAssignment_1_2");
					put(grammarAccess.getAppendExpressionAccess().getRightExprAssignment_1_2(), "rule__AppendExpression__RightExprAssignment_1_2");
					put(grammarAccess.getOrExpressionAccess().getRightExprAssignment_1_2(), "rule__OrExpression__RightExprAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRightExprAssignment_1_2(), "rule__AndExpression__RightExprAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOpNameAssignment_1_1(), "rule__RelationalExpression__OpNameAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightExprAssignment_1_2(), "rule__RelationalExpression__RightExprAssignment_1_2");
					put(grammarAccess.getEqualityExpressionAccess().getOpNameAssignment_1_1(), "rule__EqualityExpression__OpNameAssignment_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getRightExprAssignment_1_2(), "rule__EqualityExpression__RightExprAssignment_1_2");
					put(grammarAccess.getShiftExpressionAccess().getOpNameAssignment_1_1(), "rule__ShiftExpression__OpNameAssignment_1_1");
					put(grammarAccess.getShiftExpressionAccess().getRightExprAssignment_1_2(), "rule__ShiftExpression__RightExprAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOpNameAssignment_1_1(), "rule__AdditiveExpression__OpNameAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightExprAssignment_1_2(), "rule__AdditiveExpression__RightExprAssignment_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpNameAssignment_1_1(), "rule__MultiplicativeExpression__OpNameAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightExprAssignment_1_2(), "rule__MultiplicativeExpression__RightExprAssignment_1_2");
					put(grammarAccess.getMatchingExpressionAccess().getOpNameAssignment_1_1(), "rule__MatchingExpression__OpNameAssignment_1_1");
					put(grammarAccess.getMatchingExpressionAccess().getRightExprAssignment_1_2(), "rule__MatchingExpression__RightExprAssignment_1_2");
					put(grammarAccess.getInExpressionAccess().getOpNameAssignment_1_1(), "rule__InExpression__OpNameAssignment_1_1");
					put(grammarAccess.getInExpressionAccess().getRightExprAssignment_1_2(), "rule__InExpression__RightExprAssignment_1_2");
					put(grammarAccess.getUnaryMinusExpressionAccess().getExprAssignment_1(), "rule__UnaryMinusExpression__ExprAssignment_1");
					put(grammarAccess.getNotExpressionAccess().getExprAssignment_1(), "rule__NotExpression__ExprAssignment_1");
					put(grammarAccess.getCollectExpressionAccess().getQueryAssignment_1_1(), "rule__CollectExpression__QueryAssignment_1_1");
					put(grammarAccess.getCollectExpressionAccess().getAttributesAssignment_1_2_1(), "rule__CollectExpression__AttributesAssignment_1_2_1");
					put(grammarAccess.getVirtualCollectQueryAccess().getExprAssignment_2(), "rule__VirtualCollectQuery__ExprAssignment_2");
					put(grammarAccess.getExportedCollectQueryAccess().getExprAssignment_2(), "rule__ExportedCollectQuery__ExprAssignment_2");
					put(grammarAccess.getSelectorExpressionAccess().getParametersAssignment_1_2_0_1(), "rule__SelectorExpression__ParametersAssignment_1_2_0_1");
					put(grammarAccess.getSelectorExpressionAccess().getParametersAssignment_1_2_0_2_1(), "rule__SelectorExpression__ParametersAssignment_1_2_0_2_1");
					put(grammarAccess.getSelectorExpressionAccess().getParametersAssignment_1_2_1(), "rule__SelectorExpression__ParametersAssignment_1_2_1");
					put(grammarAccess.getSelectorEntryAccess().getRightExprAssignment_1_2(), "rule__SelectorEntry__RightExprAssignment_1_2");
					put(grammarAccess.getAtExpressionAccess().getParametersAssignment_1_2_0(), "rule__AtExpression__ParametersAssignment_1_2_0");
					put(grammarAccess.getAtExpressionAccess().getParametersAssignment_1_2_1_1(), "rule__AtExpression__ParametersAssignment_1_2_1_1");
					put(grammarAccess.getFunctionCallAccess().getParametersAssignment_1_2_0(), "rule__FunctionCall__ParametersAssignment_1_2_0");
					put(grammarAccess.getFunctionCallAccess().getParametersAssignment_1_2_1_1(), "rule__FunctionCall__ParametersAssignment_1_2_1_1");
					put(grammarAccess.getNodeDefinitionAccess().getHostNamesAssignment_1(), "rule__NodeDefinition__HostNamesAssignment_1");
					put(grammarAccess.getNodeDefinitionAccess().getHostNamesAssignment_2_1(), "rule__NodeDefinition__HostNamesAssignment_2_1");
					put(grammarAccess.getNodeDefinitionAccess().getParentNameAssignment_3_1(), "rule__NodeDefinition__ParentNameAssignment_3_1");
					put(grammarAccess.getNodeDefinitionAccess().getStatementsAssignment_5(), "rule__NodeDefinition__StatementsAssignment_5");
					put(grammarAccess.getHostClassDefinitionAccess().getClassNameAssignment_1(), "rule__HostClassDefinition__ClassNameAssignment_1");
					put(grammarAccess.getHostClassDefinitionAccess().getArgumentsAssignment_2(), "rule__HostClassDefinition__ArgumentsAssignment_2");
					put(grammarAccess.getHostClassDefinitionAccess().getParentAssignment_3_1(), "rule__HostClassDefinition__ParentAssignment_3_1");
					put(grammarAccess.getHostClassDefinitionAccess().getStatementsAssignment_5(), "rule__HostClassDefinition__StatementsAssignment_5");
					put(grammarAccess.getDefinitionAccess().getClassNameAssignment_1(), "rule__Definition__ClassNameAssignment_1");
					put(grammarAccess.getDefinitionAccess().getArgumentsAssignment_2(), "rule__Definition__ArgumentsAssignment_2");
					put(grammarAccess.getDefinitionAccess().getStatementsAssignment_4(), "rule__Definition__StatementsAssignment_4");
					put(grammarAccess.getDefinitionArgumentListAccess().getArgumentsAssignment_2_0(), "rule__DefinitionArgumentList__ArgumentsAssignment_2_0");
					put(grammarAccess.getDefinitionArgumentListAccess().getArgumentsAssignment_2_1_1(), "rule__DefinitionArgumentList__ArgumentsAssignment_2_1_1");
					put(grammarAccess.getDefinitionArgumentAccess().getArgNameAssignment_0(), "rule__DefinitionArgument__ArgNameAssignment_0");
					put(grammarAccess.getDefinitionArgumentAccess().getOpAssignment_1_0_0(), "rule__DefinitionArgument__OpAssignment_1_0_0");
					put(grammarAccess.getDefinitionArgumentAccess().getOpAssignment_1_0_1(), "rule__DefinitionArgument__OpAssignment_1_0_1");
					put(grammarAccess.getDefinitionArgumentAccess().getValueAssignment_1_1(), "rule__DefinitionArgument__ValueAssignment_1_1");
					put(grammarAccess.getCaseExpressionAccess().getSwitchExprAssignment_1(), "rule__CaseExpression__SwitchExprAssignment_1");
					put(grammarAccess.getCaseExpressionAccess().getCasesAssignment_3(), "rule__CaseExpression__CasesAssignment_3");
					put(grammarAccess.getCaseAccess().getValuesAssignment_0(), "rule__Case__ValuesAssignment_0");
					put(grammarAccess.getCaseAccess().getValuesAssignment_1_1(), "rule__Case__ValuesAssignment_1_1");
					put(grammarAccess.getCaseAccess().getStatementsAssignment_4(), "rule__Case__StatementsAssignment_4");
					put(grammarAccess.getIfExpressionAccess().getCondExprAssignment_1(), "rule__IfExpression__CondExprAssignment_1");
					put(grammarAccess.getIfExpressionAccess().getThenStatementsAssignment_3(), "rule__IfExpression__ThenStatementsAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getElseStatementAssignment_5_0_1(), "rule__IfExpression__ElseStatementAssignment_5_0_1");
					put(grammarAccess.getIfExpressionAccess().getElseStatementAssignment_5_1_1(), "rule__IfExpression__ElseStatementAssignment_5_1_1");
					put(grammarAccess.getElseExpressionAccess().getStatementsAssignment_2(), "rule__ElseExpression__StatementsAssignment_2");
					put(grammarAccess.getElseIfExpressionAccess().getCondExprAssignment_1(), "rule__ElseIfExpression__CondExprAssignment_1");
					put(grammarAccess.getElseIfExpressionAccess().getThenStatementsAssignment_3(), "rule__ElseIfExpression__ThenStatementsAssignment_3");
					put(grammarAccess.getElseIfExpressionAccess().getElseStatementAssignment_5_0_1(), "rule__ElseIfExpression__ElseStatementAssignment_5_0_1");
					put(grammarAccess.getElseIfExpressionAccess().getElseStatementAssignment_5_1_1(), "rule__ElseIfExpression__ElseStatementAssignment_5_1_1");
					put(grammarAccess.getLiteralNameOrReferenceAccess().getValueAssignment(), "rule__LiteralNameOrReference__ValueAssignment");
					put(grammarAccess.getParenthisedExpressionAccess().getExprAssignment_2(), "rule__ParenthisedExpression__ExprAssignment_2");
					put(grammarAccess.getVirtualNameOrReferenceAccess().getExportedAssignment_1(), "rule__VirtualNameOrReference__ExportedAssignment_1");
					put(grammarAccess.getVirtualNameOrReferenceAccess().getValueAssignment_2(), "rule__VirtualNameOrReference__ValueAssignment_2");
					put(grammarAccess.getImportExpressionAccess().getValuesAssignment_2_0(), "rule__ImportExpression__ValuesAssignment_2_0");
					put(grammarAccess.getImportExpressionAccess().getValuesAssignment_2_1_1(), "rule__ImportExpression__ValuesAssignment_2_1_1");
					put(grammarAccess.getLiteralListAccess().getElementsAssignment_2_0(), "rule__LiteralList__ElementsAssignment_2_0");
					put(grammarAccess.getLiteralListAccess().getElementsAssignment_2_1_1(), "rule__LiteralList__ElementsAssignment_2_1_1");
					put(grammarAccess.getLiteralHashAccess().getElementsAssignment_2_0(), "rule__LiteralHash__ElementsAssignment_2_0");
					put(grammarAccess.getLiteralHashAccess().getElementsAssignment_2_1_1(), "rule__LiteralHash__ElementsAssignment_2_1_1");
					put(grammarAccess.getHashEntryAccess().getKeyAssignment_0(), "rule__HashEntry__KeyAssignment_0");
					put(grammarAccess.getHashEntryAccess().getValueAssignment_2(), "rule__HashEntry__ValueAssignment_2");
					put(grammarAccess.getLiteralBooleanAccess().getValueAssignment(), "rule__LiteralBoolean__ValueAssignment");
					put(grammarAccess.getSingleQuotedStringAccess().getTextAssignment_1(), "rule__SingleQuotedString__TextAssignment_1");
					put(grammarAccess.getDoubleQuotedStringAccess().getStringPartAssignment_2(), "rule__DoubleQuotedString__StringPartAssignment_2");
					put(grammarAccess.getTextExpressionAccess().getTextAssignment_0_1(), "rule__TextExpression__TextAssignment_0_1");
					put(grammarAccess.getTextExpressionAccess().getExpressionAssignment_1_2(), "rule__TextExpression__ExpressionAssignment_1_2");
					put(grammarAccess.getTextExpressionAccess().getVarNameAssignment_2_1(), "rule__TextExpression__VarNameAssignment_2_1");
					put(grammarAccess.getExpressionWithHiddenAccess().getExprAssignment_1(), "rule__ExpressionWithHidden__ExprAssignment_1");
					put(grammarAccess.getStringPartAccess().getTextAssignment_1(), "rule__StringPart__TextAssignment_1");
					put(grammarAccess.getUnquotedStringAccess().getExpressionAssignment_2(), "rule__UnquotedString__ExpressionAssignment_2");
					put(grammarAccess.getLiteralRegexAccess().getValueAssignment(), "rule__LiteralRegex__ValueAssignment");
					put(grammarAccess.getLiteralNameAccess().getValueAssignment(), "rule__LiteralName__ValueAssignment");
					put(grammarAccess.getVariableExpressionAccess().getVarNameAssignment(), "rule__VariableExpression__VarNameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.cloudsmith.geppetto.pp.dsl.ui.contentassist.antlr.internal.InternalPPParser typedParser = (org.cloudsmith.geppetto.pp.dsl.ui.contentassist.antlr.internal.InternalPPParser) parser;
			typedParser.entryRulePuppetManifest();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT" };
	}
	
	public PPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
