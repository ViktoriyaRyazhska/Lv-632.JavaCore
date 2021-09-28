package com.company.models;

public enum HttpError {
    BadRequest("400 Bad Request — Неправильний запит."),
    Unauthorized("401 Unauthorized — Несанкціонований доступ."),
    PaymentRequired("402 Payment Required — Потрібна оплата. Зарезервовано для майбутнього використання."),
    Forbidden("403 Forbidden — Заборонено."),
    NotFound("404 Not Found — Ресурс не знайдено.");

    private final String value;

    HttpError(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
