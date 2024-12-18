---
stoplight-id: 59vt70pmkm4j3
---

# Overview

<Note>
  This guide explains how to integrate external tax services with Chargebee using the Tax Service Provider Interface (SPI).
</Note>

### Key Operations

When processing checkout sessions and creating invoices for the merchant’s customer, Chargebee needs to perform the following operations:

Checking whether customer shipping addresses are valid for the purpose of tax calculation

Estimate taxes applicable on an invoice and its line items

Submit invoice and credit note documents for tax reconciliation

Validate customer shipping addresses for the purpose of product delivery

Chargebee relies on external services to fulfill these needs. These external services or tax services may be of one of the following:

Tax service providers that offer APIs for calculating tax.

In-house tax calculation software used by the merchant.

To communicate with the tax service, Chargebee needs a tax service adapter that acts as a connector with the service. Chargebee connects to the adapter using the Tax Service Provider Interface (SPI).

You must implement this SPI by building a tax service adapter app in order to integrate the tax service with Chargebee. You would typically do this when you are one of the following:

A tax service provider wanting to integrate your service with Chargebee.

A merchant looking to integrate your in-house tax calculation software with Chargebee.

A system integrator building a connector between a tax service provider and Chargebee.
