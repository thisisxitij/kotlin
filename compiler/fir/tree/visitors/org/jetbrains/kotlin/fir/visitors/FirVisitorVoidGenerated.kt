/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license 
 * that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.fir.visitors

import org.jetbrains.kotlin.fir.*
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.declarations.impl.*
import org.jetbrains.kotlin.fir.expressions.*
import org.jetbrains.kotlin.fir.expressions.impl.*
import org.jetbrains.kotlin.fir.types.*


/** This file generated by :compiler:fir:tree:generateVisitors. DO NOT MODIFY MANUALLY! */
abstract class FirVisitorVoid : FirVisitor<Unit, Nothing?>() {
    abstract fun visitElement(element: FirElement)

    open fun visitCatch(catch: FirCatch) {
        visitElement(catch, null)
    }

    open fun visitDeclaration(declaration: FirDeclaration) {
        visitElement(declaration, null)
    }

    open fun visitCallableDeclaration(callableDeclaration: FirCallableDeclaration) {
        visitDeclaration(callableDeclaration, null)
    }

    open fun visitCallableMemberDeclaration(callableMemberDeclaration: FirCallableMemberDeclaration) {
        visitDeclaration(callableMemberDeclaration, null)
    }

    open fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody) {
        visitDeclaration(declarationWithBody, null)
    }

    open fun visitAnonymousInitializer(anonymousInitializer: FirAnonymousInitializer) {
        visitDeclarationWithBody(anonymousInitializer, null)
    }

    open fun visitFunction(function: FirFunction) {
        visitDeclarationWithBody(function, null)
    }

    open fun visitAnonymousFunction(anonymousFunction: FirAnonymousFunction) {
        visitFunction(anonymousFunction, null)
    }

    open fun visitConstructor(constructor: FirConstructor) {
        visitFunction(constructor, null)
    }

    open fun visitModifiableFunction(modifiableFunction: FirModifiableFunction) {
        visitFunction(modifiableFunction, null)
    }

    open fun visitNamedFunction(namedFunction: FirNamedFunction) {
        visitFunction(namedFunction, null)
    }

    open fun visitPropertyAccessor(propertyAccessor: FirPropertyAccessor) {
        visitFunction(propertyAccessor, null)
    }

    open fun visitErrorDeclaration(errorDeclaration: FirErrorDeclaration) {
        visitDeclaration(errorDeclaration, null)
    }

    open fun visitField(field: FirField) {
        visitDeclaration(field, null)
    }

    open fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration) {
        visitDeclaration(namedDeclaration, null)
    }

    open fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration) {
        visitNamedDeclaration(memberDeclaration, null)
    }

    open fun visitClassLikeDeclaration(classLikeDeclaration: FirClassLikeDeclaration) {
        visitMemberDeclaration(classLikeDeclaration, null)
    }

    open fun visitRegularClass(regularClass: FirRegularClass) {
        visitClassLikeDeclaration(regularClass, null)
    }

    open fun visitEnumEntry(enumEntry: FirEnumEntry) {
        visitRegularClass(enumEntry, null)
    }

    open fun visitTypeAlias(typeAlias: FirTypeAlias) {
        visitClassLikeDeclaration(typeAlias, null)
    }

    open fun visitTypeParameter(typeParameter: FirTypeParameter) {
        visitNamedDeclaration(typeParameter, null)
    }

    open fun visitProperty(property: FirProperty) {
        visitDeclaration(property, null)
    }

    open fun visitTypedDeclaration(typedDeclaration: FirTypedDeclaration) {
        visitDeclaration(typedDeclaration, null)
    }

    open fun visitValueParameter(valueParameter: FirValueParameter) {
        visitDeclaration(valueParameter, null)
    }

    open fun visitVariable(variable: FirVariable) {
        visitDeclaration(variable, null)
    }

    open fun visitDeclarationStatus(declarationStatus: FirDeclarationStatus) {
        visitElement(declarationStatus, null)
    }

    open fun visitResolvedDeclarationStatus(resolvedDeclarationStatus: FirResolvedDeclarationStatus) {
        visitDeclarationStatus(resolvedDeclarationStatus, null)
    }

    open fun visitImport(import: FirImport) {
        visitElement(import, null)
    }

    open fun visitResolvedImport(resolvedImport: FirResolvedImport) {
        visitImport(resolvedImport, null)
    }

    open fun visitLabel(label: FirLabel) {
        visitElement(label, null)
    }

    open fun visitPackageFragment(packageFragment: FirPackageFragment) {
        visitElement(packageFragment, null)
    }

    open fun visitFile(file: FirFile) {
        visitPackageFragment(file, null)
    }

    open fun visitReference(reference: FirReference) {
        visitElement(reference, null)
    }

    open fun visitNamedReference(namedReference: FirNamedReference) {
        visitReference(namedReference, null)
    }

    open fun visitResolvedCallableReference(resolvedCallableReference: FirResolvedCallableReference) {
        visitNamedReference(resolvedCallableReference, null)
    }

    open fun visitSuperReference(superReference: FirSuperReference) {
        visitReference(superReference, null)
    }

    open fun visitThisReference(thisReference: FirThisReference) {
        visitReference(thisReference, null)
    }

    open fun visitStatement(statement: FirStatement) {
        visitElement(statement, null)
    }

    open fun visitClass(klass: FirClass) {
        visitStatement(klass, null)
    }

    open fun visitAnonymousObject(anonymousObject: FirAnonymousObject) {
        visitClass(anonymousObject, null)
    }

    open fun visitModifiableClass(modifiableClass: FirModifiableClass) {
        visitClass(modifiableClass, null)
    }

    open fun visitErrorStatement(errorStatement: FirErrorStatement) {
        visitStatement(errorStatement, null)
    }

    open fun visitExpression(expression: FirExpression) {
        visitStatement(expression, null)
    }

    open fun visitBlock(block: FirBlock) {
        visitExpression(block, null)
    }

    open fun visitCall(call: FirCall) {
        visitExpression(call, null)
    }

    open fun visitAnnotationCall(annotationCall: FirAnnotationCall) {
        visitCall(annotationCall, null)
    }

    open fun visitArrayOfCall(arrayOfCall: FirArrayOfCall) {
        visitCall(arrayOfCall, null)
    }

    open fun visitArraySetCall(arraySetCall: FirArraySetCall) {
        visitCall(arraySetCall, null)
    }

    open fun visitDelegatedConstructorCall(delegatedConstructorCall: FirDelegatedConstructorCall) {
        visitCall(delegatedConstructorCall, null)
    }

    open fun visitFunctionCall(functionCall: FirFunctionCall) {
        visitCall(functionCall, null)
    }

    open fun visitComponentCall(componentCall: FirComponentCall) {
        visitFunctionCall(componentCall, null)
    }

    open fun visitGetClassCall(getClassCall: FirGetClassCall) {
        visitCall(getClassCall, null)
    }

    open fun visitOperatorCall(operatorCall: FirOperatorCall) {
        visitCall(operatorCall, null)
    }

    open fun visitTypeOperatorCall(typeOperatorCall: FirTypeOperatorCall) {
        visitOperatorCall(typeOperatorCall, null)
    }

    open fun visitStringConcatenationCall(stringConcatenationCall: FirStringConcatenationCall) {
        visitCall(stringConcatenationCall, null)
    }

    open fun visitClassReferenceExpression(classReferenceExpression: FirClassReferenceExpression) {
        visitExpression(classReferenceExpression, null)
    }

    open fun <T> visitConstExpression(constExpression: FirConstExpression<T>) {
        visitExpression(constExpression, null)
    }

    open fun visitErrorExpression(errorExpression: FirErrorExpression) {
        visitExpression(errorExpression, null)
    }

    open fun <E : FirTargetElement> visitJump(jump: FirJump<E>) {
        visitExpression(jump, null)
    }

    open fun visitBreakExpression(breakExpression: FirBreakExpression) {
        visitJump(breakExpression, null)
    }

    open fun visitContinueExpression(continueExpression: FirContinueExpression) {
        visitJump(continueExpression, null)
    }

    open fun visitReturnExpression(returnExpression: FirReturnExpression) {
        visitJump(returnExpression, null)
    }

    open fun visitThrowExpression(throwExpression: FirThrowExpression) {
        visitExpression(throwExpression, null)
    }

    open fun visitTryExpression(tryExpression: FirTryExpression) {
        visitExpression(tryExpression, null)
    }

    open fun visitWhenExpression(whenExpression: FirWhenExpression) {
        visitExpression(whenExpression, null)
    }

    open fun visitWrappedArgumentExpression(wrappedArgumentExpression: FirWrappedArgumentExpression) {
        visitExpression(wrappedArgumentExpression, null)
    }

    open fun visitLambdaArgumentExpression(lambdaArgumentExpression: FirLambdaArgumentExpression) {
        visitWrappedArgumentExpression(lambdaArgumentExpression, null)
    }

    open fun visitNamedArgumentExpression(namedArgumentExpression: FirNamedArgumentExpression) {
        visitWrappedArgumentExpression(namedArgumentExpression, null)
    }

    open fun visitLoop(loop: FirLoop) {
        visitStatement(loop, null)
    }

    open fun visitDoWhileLoop(doWhileLoop: FirDoWhileLoop) {
        visitLoop(doWhileLoop, null)
    }

    open fun visitWhileLoop(whileLoop: FirWhileLoop) {
        visitLoop(whileLoop, null)
    }

    open fun visitQualifiedAccess(qualifiedAccess: FirQualifiedAccess) {
        visitStatement(qualifiedAccess, null)
    }

    open fun visitAssignment(assignment: FirAssignment) {
        visitQualifiedAccess(assignment, null)
    }

    open fun visitVariableAssignment(variableAssignment: FirVariableAssignment) {
        visitAssignment(variableAssignment, null)
    }

    open fun visitModifiableQualifiedAccess(modifiableQualifiedAccess: FirModifiableQualifiedAccess) {
        visitQualifiedAccess(modifiableQualifiedAccess, null)
    }

    open fun visitQualifiedAccessExpression(qualifiedAccessExpression: FirQualifiedAccessExpression) {
        visitQualifiedAccess(qualifiedAccessExpression, null)
    }

    open fun visitCallableReferenceAccess(callableReferenceAccess: FirCallableReferenceAccess) {
        visitQualifiedAccessExpression(callableReferenceAccess, null)
    }

    open fun visitTargetElement(targetElement: FirTargetElement) {
        visitElement(targetElement, null)
    }

    open fun visitLabeledElement(labeledElement: FirLabeledElement) {
        visitTargetElement(labeledElement, null)
    }

    open fun visitTypeProjection(typeProjection: FirTypeProjection) {
        visitElement(typeProjection, null)
    }

    open fun visitStarProjection(starProjection: FirStarProjection) {
        visitTypeProjection(starProjection, null)
    }

    open fun visitTypeProjectionWithVariance(typeProjectionWithVariance: FirTypeProjectionWithVariance) {
        visitTypeProjection(typeProjectionWithVariance, null)
    }

    open fun visitTypeRef(typeRef: FirTypeRef) {
        visitElement(typeRef, null)
    }

    open fun visitDelegatedTypeRef(delegatedTypeRef: FirDelegatedTypeRef) {
        visitTypeRef(delegatedTypeRef, null)
    }

    open fun visitImplicitTypeRef(implicitTypeRef: FirImplicitTypeRef) {
        visitTypeRef(implicitTypeRef, null)
    }

    open fun visitTypeRefWithNullability(typeRefWithNullability: FirTypeRefWithNullability) {
        visitTypeRef(typeRefWithNullability, null)
    }

    open fun visitDynamicTypeRef(dynamicTypeRef: FirDynamicTypeRef) {
        visitTypeRefWithNullability(dynamicTypeRef, null)
    }

    open fun visitFunctionTypeRef(functionTypeRef: FirFunctionTypeRef) {
        visitTypeRefWithNullability(functionTypeRef, null)
    }

    open fun visitResolvedTypeRef(resolvedTypeRef: FirResolvedTypeRef) {
        visitTypeRefWithNullability(resolvedTypeRef, null)
    }

    open fun visitErrorTypeRef(errorTypeRef: FirErrorTypeRef) {
        visitResolvedTypeRef(errorTypeRef, null)
    }

    open fun visitResolvedFunctionTypeRef(resolvedFunctionTypeRef: FirResolvedFunctionTypeRef) {
        visitResolvedTypeRef(resolvedFunctionTypeRef, null)
    }

    open fun visitUserTypeRef(userTypeRef: FirUserTypeRef) {
        visitTypeRefWithNullability(userTypeRef, null)
    }

    open fun visitWhenBranch(whenBranch: FirWhenBranch) {
        visitElement(whenBranch, null)
    }

    final override fun visitAnnotationCall(annotationCall: FirAnnotationCall, data: Nothing?) {
        visitAnnotationCall(annotationCall)
    }

    final override fun visitAnonymousFunction(anonymousFunction: FirAnonymousFunction, data: Nothing?) {
        visitAnonymousFunction(anonymousFunction)
    }

    final override fun visitAnonymousInitializer(anonymousInitializer: FirAnonymousInitializer, data: Nothing?) {
        visitAnonymousInitializer(anonymousInitializer)
    }

    final override fun visitAnonymousObject(anonymousObject: FirAnonymousObject, data: Nothing?) {
        visitAnonymousObject(anonymousObject)
    }

    final override fun visitArrayOfCall(arrayOfCall: FirArrayOfCall, data: Nothing?) {
        visitArrayOfCall(arrayOfCall)
    }

    final override fun visitArraySetCall(arraySetCall: FirArraySetCall, data: Nothing?) {
        visitArraySetCall(arraySetCall)
    }

    final override fun visitAssignment(assignment: FirAssignment, data: Nothing?) {
        visitAssignment(assignment)
    }

    final override fun visitBlock(block: FirBlock, data: Nothing?) {
        visitBlock(block)
    }

    final override fun visitBreakExpression(breakExpression: FirBreakExpression, data: Nothing?) {
        visitBreakExpression(breakExpression)
    }

    final override fun visitCall(call: FirCall, data: Nothing?) {
        visitCall(call)
    }

    final override fun visitCallableDeclaration(callableDeclaration: FirCallableDeclaration, data: Nothing?) {
        visitCallableDeclaration(callableDeclaration)
    }

    final override fun visitCallableMemberDeclaration(callableMemberDeclaration: FirCallableMemberDeclaration, data: Nothing?) {
        visitCallableMemberDeclaration(callableMemberDeclaration)
    }

    final override fun visitCallableReferenceAccess(callableReferenceAccess: FirCallableReferenceAccess, data: Nothing?) {
        visitCallableReferenceAccess(callableReferenceAccess)
    }

    final override fun visitCatch(catch: FirCatch, data: Nothing?) {
        visitCatch(catch)
    }

    final override fun visitClass(klass: FirClass, data: Nothing?) {
        visitClass(klass)
    }

    final override fun visitClassLikeDeclaration(classLikeDeclaration: FirClassLikeDeclaration, data: Nothing?) {
        visitClassLikeDeclaration(classLikeDeclaration)
    }

    final override fun visitClassReferenceExpression(classReferenceExpression: FirClassReferenceExpression, data: Nothing?) {
        visitClassReferenceExpression(classReferenceExpression)
    }

    final override fun visitComponentCall(componentCall: FirComponentCall, data: Nothing?) {
        visitComponentCall(componentCall)
    }

    final override fun <T> visitConstExpression(constExpression: FirConstExpression<T>, data: Nothing?) {
        visitConstExpression(constExpression)
    }

    final override fun visitConstructor(constructor: FirConstructor, data: Nothing?) {
        visitConstructor(constructor)
    }

    final override fun visitContinueExpression(continueExpression: FirContinueExpression, data: Nothing?) {
        visitContinueExpression(continueExpression)
    }

    final override fun visitDeclaration(declaration: FirDeclaration, data: Nothing?) {
        visitDeclaration(declaration)
    }

    final override fun visitDeclarationStatus(declarationStatus: FirDeclarationStatus, data: Nothing?) {
        visitDeclarationStatus(declarationStatus)
    }

    final override fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody, data: Nothing?) {
        visitDeclarationWithBody(declarationWithBody)
    }

    final override fun visitDelegatedConstructorCall(delegatedConstructorCall: FirDelegatedConstructorCall, data: Nothing?) {
        visitDelegatedConstructorCall(delegatedConstructorCall)
    }

    final override fun visitDelegatedTypeRef(delegatedTypeRef: FirDelegatedTypeRef, data: Nothing?) {
        visitDelegatedTypeRef(delegatedTypeRef)
    }

    final override fun visitDoWhileLoop(doWhileLoop: FirDoWhileLoop, data: Nothing?) {
        visitDoWhileLoop(doWhileLoop)
    }

    final override fun visitDynamicTypeRef(dynamicTypeRef: FirDynamicTypeRef, data: Nothing?) {
        visitDynamicTypeRef(dynamicTypeRef)
    }

    final override fun visitEnumEntry(enumEntry: FirEnumEntry, data: Nothing?) {
        visitEnumEntry(enumEntry)
    }

    final override fun visitErrorDeclaration(errorDeclaration: FirErrorDeclaration, data: Nothing?) {
        visitErrorDeclaration(errorDeclaration)
    }

    final override fun visitErrorExpression(errorExpression: FirErrorExpression, data: Nothing?) {
        visitErrorExpression(errorExpression)
    }

    final override fun visitErrorStatement(errorStatement: FirErrorStatement, data: Nothing?) {
        visitErrorStatement(errorStatement)
    }

    final override fun visitErrorTypeRef(errorTypeRef: FirErrorTypeRef, data: Nothing?) {
        visitErrorTypeRef(errorTypeRef)
    }

    final override fun visitExpression(expression: FirExpression, data: Nothing?) {
        visitExpression(expression)
    }

    final override fun visitField(field: FirField, data: Nothing?) {
        visitField(field)
    }

    final override fun visitFile(file: FirFile, data: Nothing?) {
        visitFile(file)
    }

    final override fun visitFunction(function: FirFunction, data: Nothing?) {
        visitFunction(function)
    }

    final override fun visitFunctionCall(functionCall: FirFunctionCall, data: Nothing?) {
        visitFunctionCall(functionCall)
    }

    final override fun visitFunctionTypeRef(functionTypeRef: FirFunctionTypeRef, data: Nothing?) {
        visitFunctionTypeRef(functionTypeRef)
    }

    final override fun visitGetClassCall(getClassCall: FirGetClassCall, data: Nothing?) {
        visitGetClassCall(getClassCall)
    }

    final override fun visitImplicitTypeRef(implicitTypeRef: FirImplicitTypeRef, data: Nothing?) {
        visitImplicitTypeRef(implicitTypeRef)
    }

    final override fun visitImport(import: FirImport, data: Nothing?) {
        visitImport(import)
    }

    final override fun <E : FirTargetElement> visitJump(jump: FirJump<E>, data: Nothing?) {
        visitJump(jump)
    }

    final override fun visitLabel(label: FirLabel, data: Nothing?) {
        visitLabel(label)
    }

    final override fun visitLabeledElement(labeledElement: FirLabeledElement, data: Nothing?) {
        visitLabeledElement(labeledElement)
    }

    final override fun visitLambdaArgumentExpression(lambdaArgumentExpression: FirLambdaArgumentExpression, data: Nothing?) {
        visitLambdaArgumentExpression(lambdaArgumentExpression)
    }

    final override fun visitLoop(loop: FirLoop, data: Nothing?) {
        visitLoop(loop)
    }

    final override fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration, data: Nothing?) {
        visitMemberDeclaration(memberDeclaration)
    }

    final override fun visitModifiableClass(modifiableClass: FirModifiableClass, data: Nothing?) {
        visitModifiableClass(modifiableClass)
    }

    final override fun visitModifiableFunction(modifiableFunction: FirModifiableFunction, data: Nothing?) {
        visitModifiableFunction(modifiableFunction)
    }

    final override fun visitModifiableQualifiedAccess(modifiableQualifiedAccess: FirModifiableQualifiedAccess, data: Nothing?) {
        visitModifiableQualifiedAccess(modifiableQualifiedAccess)
    }

    final override fun visitNamedArgumentExpression(namedArgumentExpression: FirNamedArgumentExpression, data: Nothing?) {
        visitNamedArgumentExpression(namedArgumentExpression)
    }

    final override fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration, data: Nothing?) {
        visitNamedDeclaration(namedDeclaration)
    }

    final override fun visitNamedFunction(namedFunction: FirNamedFunction, data: Nothing?) {
        visitNamedFunction(namedFunction)
    }

    final override fun visitNamedReference(namedReference: FirNamedReference, data: Nothing?) {
        visitNamedReference(namedReference)
    }

    final override fun visitOperatorCall(operatorCall: FirOperatorCall, data: Nothing?) {
        visitOperatorCall(operatorCall)
    }

    final override fun visitPackageFragment(packageFragment: FirPackageFragment, data: Nothing?) {
        visitPackageFragment(packageFragment)
    }

    final override fun visitProperty(property: FirProperty, data: Nothing?) {
        visitProperty(property)
    }

    final override fun visitPropertyAccessor(propertyAccessor: FirPropertyAccessor, data: Nothing?) {
        visitPropertyAccessor(propertyAccessor)
    }

    final override fun visitQualifiedAccess(qualifiedAccess: FirQualifiedAccess, data: Nothing?) {
        visitQualifiedAccess(qualifiedAccess)
    }

    final override fun visitQualifiedAccessExpression(qualifiedAccessExpression: FirQualifiedAccessExpression, data: Nothing?) {
        visitQualifiedAccessExpression(qualifiedAccessExpression)
    }

    final override fun visitReference(reference: FirReference, data: Nothing?) {
        visitReference(reference)
    }

    final override fun visitRegularClass(regularClass: FirRegularClass, data: Nothing?) {
        visitRegularClass(regularClass)
    }

    final override fun visitResolvedCallableReference(resolvedCallableReference: FirResolvedCallableReference, data: Nothing?) {
        visitResolvedCallableReference(resolvedCallableReference)
    }

    final override fun visitResolvedDeclarationStatus(resolvedDeclarationStatus: FirResolvedDeclarationStatus, data: Nothing?) {
        visitResolvedDeclarationStatus(resolvedDeclarationStatus)
    }

    final override fun visitResolvedFunctionTypeRef(resolvedFunctionTypeRef: FirResolvedFunctionTypeRef, data: Nothing?) {
        visitResolvedFunctionTypeRef(resolvedFunctionTypeRef)
    }

    final override fun visitResolvedImport(resolvedImport: FirResolvedImport, data: Nothing?) {
        visitResolvedImport(resolvedImport)
    }

    final override fun visitResolvedTypeRef(resolvedTypeRef: FirResolvedTypeRef, data: Nothing?) {
        visitResolvedTypeRef(resolvedTypeRef)
    }

    final override fun visitReturnExpression(returnExpression: FirReturnExpression, data: Nothing?) {
        visitReturnExpression(returnExpression)
    }

    final override fun visitStarProjection(starProjection: FirStarProjection, data: Nothing?) {
        visitStarProjection(starProjection)
    }

    final override fun visitStatement(statement: FirStatement, data: Nothing?) {
        visitStatement(statement)
    }

    final override fun visitStringConcatenationCall(stringConcatenationCall: FirStringConcatenationCall, data: Nothing?) {
        visitStringConcatenationCall(stringConcatenationCall)
    }

    final override fun visitSuperReference(superReference: FirSuperReference, data: Nothing?) {
        visitSuperReference(superReference)
    }

    final override fun visitTargetElement(targetElement: FirTargetElement, data: Nothing?) {
        visitTargetElement(targetElement)
    }

    final override fun visitThisReference(thisReference: FirThisReference, data: Nothing?) {
        visitThisReference(thisReference)
    }

    final override fun visitThrowExpression(throwExpression: FirThrowExpression, data: Nothing?) {
        visitThrowExpression(throwExpression)
    }

    final override fun visitTryExpression(tryExpression: FirTryExpression, data: Nothing?) {
        visitTryExpression(tryExpression)
    }

    final override fun visitTypeAlias(typeAlias: FirTypeAlias, data: Nothing?) {
        visitTypeAlias(typeAlias)
    }

    final override fun visitTypeOperatorCall(typeOperatorCall: FirTypeOperatorCall, data: Nothing?) {
        visitTypeOperatorCall(typeOperatorCall)
    }

    final override fun visitTypeParameter(typeParameter: FirTypeParameter, data: Nothing?) {
        visitTypeParameter(typeParameter)
    }

    final override fun visitTypeProjection(typeProjection: FirTypeProjection, data: Nothing?) {
        visitTypeProjection(typeProjection)
    }

    final override fun visitTypeProjectionWithVariance(typeProjectionWithVariance: FirTypeProjectionWithVariance, data: Nothing?) {
        visitTypeProjectionWithVariance(typeProjectionWithVariance)
    }

    final override fun visitTypeRef(typeRef: FirTypeRef, data: Nothing?) {
        visitTypeRef(typeRef)
    }

    final override fun visitTypeRefWithNullability(typeRefWithNullability: FirTypeRefWithNullability, data: Nothing?) {
        visitTypeRefWithNullability(typeRefWithNullability)
    }

    final override fun visitTypedDeclaration(typedDeclaration: FirTypedDeclaration, data: Nothing?) {
        visitTypedDeclaration(typedDeclaration)
    }

    final override fun visitUserTypeRef(userTypeRef: FirUserTypeRef, data: Nothing?) {
        visitUserTypeRef(userTypeRef)
    }

    final override fun visitValueParameter(valueParameter: FirValueParameter, data: Nothing?) {
        visitValueParameter(valueParameter)
    }

    final override fun visitVariable(variable: FirVariable, data: Nothing?) {
        visitVariable(variable)
    }

    final override fun visitVariableAssignment(variableAssignment: FirVariableAssignment, data: Nothing?) {
        visitVariableAssignment(variableAssignment)
    }

    final override fun visitWhenBranch(whenBranch: FirWhenBranch, data: Nothing?) {
        visitWhenBranch(whenBranch)
    }

    final override fun visitWhenExpression(whenExpression: FirWhenExpression, data: Nothing?) {
        visitWhenExpression(whenExpression)
    }

    final override fun visitWhileLoop(whileLoop: FirWhileLoop, data: Nothing?) {
        visitWhileLoop(whileLoop)
    }

    final override fun visitWrappedArgumentExpression(wrappedArgumentExpression: FirWrappedArgumentExpression, data: Nothing?) {
        visitWrappedArgumentExpression(wrappedArgumentExpression)
    }

    final override fun visitElement(element: FirElement, data: Nothing?) {
        visitElement(element)
    }

}
