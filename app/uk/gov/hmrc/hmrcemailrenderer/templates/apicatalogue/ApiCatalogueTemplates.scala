/*
 * Copyright 2021 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.hmrcemailrenderer.templates.apicatalogue

import uk.gov.hmrc.hmrcemailrenderer.domain.{ MessagePriority, MessageTemplate }
import uk.gov.hmrc.hmrcemailrenderer.templates.ServiceIdentifier.ApiCatalogue
import uk.gov.hmrc.hmrcemailrenderer.templates.FromAddress

/**
  * Templates used by the API Catalogue.
  */
object ApiCatalogueTemplates {
  val templates = Seq(
    MessageTemplate.create(
      templateId = "platformContact",
      fromAddress = FromAddress.noReply("API catalogue"),
      service = ApiCatalogue,
      subject = "Information request from the API catalogue",
      plainTemplate = txt.platformContact.f,
      htmlTemplate = html.platformContact.f,
      priority = Some(MessagePriority.Standard)
    ),
    MessageTemplate.create(
      templateId = "platformContactConfirmation",
      fromAddress = FromAddress.noReply("API catalogue"),
      service = ApiCatalogue,
      subject = "A summary of your message sent from the API catalogue",
      plainTemplate = txt.platformContactConfirmation.f,
      htmlTemplate = html.platformContactConfirmation.f,
      priority = Some(MessagePriority.Standard)
    )
  )
}
