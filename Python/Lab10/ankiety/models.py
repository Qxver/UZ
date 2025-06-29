from django.db import models


class Pytanie(models.Model):
    tresc_pytania = models.CharField(max_length=200)
    data_publikacji = models.DateTimeField("data publikacji")


class Wybor(models.Model):
    pytanie = models.ForeignKey(Pytanie, on_delete=models.CASCADE)
    tresc_wyboru = models.CharField(max_length=200)
    liczba_glosow = models.IntegerField(default=0)
